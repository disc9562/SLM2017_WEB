package tw.teddysoft.bdd.web.app;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import tw.teddysoft.bdd.domain.invoice.Invoice;
import tw.teddysoft.bdd.domain.invoice.InvoiceBuilder;
import tw.teddysoft.bdd.domain.invoice.companyInfoSearch;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;


/**
 * Created by teddy on 2017/3/2.
 */

/**
 * VelocityTemplateRoute example.
 */
public final class InvoiceWeb {

    public static void main(String[] args) {
//        if(args.length > 0){
//            port(Integer.valueOf(args[0]));
//            System.out.print("aaa");
//        }
        get("/invoice", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("Title", "三聯式發票");

            return new ModelAndView(model, "invoice_input.vm"); // located in the resources directory
        }, new VelocityTemplateEngine());


        post("/invoice", (request, response) -> {
            Invoice invoice;
            int taxIncludedPrice = integerValue(request.queryMap("taxIncludedPrice").value());
            int taxExcludedPrice = integerValue(request.queryMap("taxExcludedPrice").value());
            double vatRate = request.queryMap("vatRate").doubleValue();

            if (isUseTaxIncludedPriceToCalculateInvoice(taxIncludedPrice)) {
                invoice = InvoiceBuilder.newInstance().
                        withTaxIncludedPrice(taxIncludedPrice).
                        withVatRate(vatRate).
                        issue();
            }
            else {
                invoice = InvoiceBuilder.newInstance().
                        withTaxExcludedPrice(taxExcludedPrice).
                        withVatRate(vatRate).
                        issue();
            }

            Map<String, Object> model = new HashMap<>();
            model.put("invoice", invoice);
            model.put("companyName","");
            model.put("vatid","");
            return new ModelAndView(model, "invoice_result.vm"); // located in the resources directory
        }, new VelocityTemplateEngine());

        post("/company", (request, response) -> {
            Invoice invoice = new Invoice(0,0.05,0,0);
            String companyName = request.queryMap("companyName").value();
            String vatid = request.queryMap("vatid").value();

            if(isUseCompanyNameToSearch(companyName)){
                vatid = companyInfoSearch.getVatid(companyName);
            }
            else {
                companyName = companyInfoSearch.getCompanyName(vatid);
            }
            Map<String, Object> model = new HashMap<>();
            model.put("companyName",companyName);
            model.put("vatid",vatid);
            model.put("invoice", invoice);
            return new ModelAndView(model, "invoice_result.vm");
        }, new VelocityTemplateEngine());

    }

    private static boolean isUseTaxIncludedPriceToCalculateInvoice(int taxIncludedPrice){
        return !(0 == taxIncludedPrice);
    }

    private static int integerValue(String str){
        if ((null == str) || ("".equals(str)))
            return 0;
        else
           return Integer.valueOf(str);
    }
    private static boolean isUseCompanyNameToSearch(String companyName){
        return !(companyName.equals(""));
    }

}