package step;

import cucumber.api.java8.En;
import tw.teddysoft.bdd.domain.invoice.Invoice;
import tw.teddysoft.bdd.domain.invoice.InvoiceBuilder;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by teddy on 2017/3/2.
 */
public class IssuingInvoiceStep implements En {
    InvoiceBuilder builder;
    Invoice invoice;

    public IssuingInvoiceStep() {

        Given("^Ｔhe VAT rate is (\\d+\\.\\d+)$", (Double vatRate) -> {
            builder = InvoiceBuilder.newInstance();
            builder.withVatRate(vatRate);
        });

        Given("^the tax included price provided is (\\d+)$", (Integer taxIncludedPrice) -> {
            builder.withTaxIncludedPrice(taxIncludedPrice);
        });

        When("^I issue a company invoice$", () -> {
            invoice = builder.issue();
        });

        Then("^I should see the VAT is (\\d+)$", (Integer vat) -> {
            assertThat(invoice.getVat(), is (vat));
        });


        Then("^the tax excluded price is (\\d+)$", (Integer taxExcludedPrice) -> {
            assertThat(invoice.getTaxExcludedPrice(), is (taxExcludedPrice));
        });

        Given("^the tax excluded price provided is (\\d+)$", (Integer taxExcludedPrice) -> {
            builder.withTaxExcludedPrice(taxExcludedPrice);
        });

        Then("^the tax included price is (\\d+)$", (Integer taxIncludedPrice) -> {
            assertThat(invoice.getTaxIncludedPrice(), is (taxIncludedPrice));
        });
    }
}
