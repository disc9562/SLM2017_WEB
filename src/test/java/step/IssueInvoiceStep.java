package step;

import cucumber.api.java8.En;
import tw.teddysoft.bdd.domain.invoice.Invoice;
import cucumber.api.java8.En;
import static org.junit.Assert.*;

/**
 * Created by teddy on 2017/3/2.
 */
public class IssueInvoiceStep implements En {

    Invoice invoice;
    Invoice newInvoice;

    public IssueInvoiceStep() {

        Given("^Ｔhe VAT rate is (\\d+\\.\\d+)$", (Double arg1) -> {
            invoice = new Invoice();
            invoice.setVatRate(arg1);
        });

        Given("^the tax included price is (\\d+)$", (Integer arg1) -> {
            invoice.setTaxIncludedPrice(arg1);
        });


        When("^I issue a company invoice$", () -> {
            newInvoice = invoice.issue();
        });

        Then("^I should see the VAT is (\\d+)$", (Integer arg1) -> {
            assertEquals(arg1, invoice.getVAT());
        });

        Then("^the tax excluded price is (\\d+)$", (Integer arg1) -> {
            assertEquals(arg1, invoice.getTaxExcludedPrice());
        });
    }
}
