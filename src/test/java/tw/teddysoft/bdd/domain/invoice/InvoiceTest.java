package tw.teddysoft.bdd.domain.invoice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by teddy on 2017/3/2.
 */
public class InvoiceTest {


    @Test
    public void issuing_an_empty_invoice(){
        Invoice invoice = new Invoice();
        Invoice newInvoice = invoice.issue();

        assertNotNull(newInvoice);
        assertEquals(0, (int) newInvoice.getTaxIncludedPrice());
        assertEquals(0, (int) newInvoice.getVAT());
        assertEquals(0, (int) newInvoice.getTaxExcludedPrice());
        assertEquals(0, newInvoice.getVatRate(), 0.001);
    }

    @Test
    public void a_new_invoice_is_an_empty_invoice(){

        Invoice newInvoice = new Invoice();

        assertNotNull(newInvoice);
        assertEquals(0, (int) newInvoice.getTaxIncludedPrice());
        assertEquals(0, (int) newInvoice.getVAT());
        assertEquals(0, (int) newInvoice.getTaxExcludedPrice());
        assertEquals(0, newInvoice.getVatRate(), 0.001);
    }


    @Test
    public void issuing_an_invoice_with_tax_included_price(){

        Invoice invoice = new Invoice();
        invoice.setVatRate(0.05);
        invoice.setTaxIncludedPrice(17000);
        Invoice newInvoice = invoice.issue();

        assertNotNull(newInvoice);
        assertEquals(17000, (int) newInvoice.getTaxIncludedPrice());
        assertEquals(810, (int) newInvoice.getVAT());
        assertEquals(16190, (int) newInvoice.getTaxExcludedPrice());
        assertEquals(0.05, newInvoice.getVatRate(), 0.001);
    }


    @Test
    public void reset_tax_included_price_will_recalculate_VAT_and_tax_excluded_price(){

        Invoice invoice = new Invoice();
        invoice.setVatRate(0.05);
        invoice.setTaxIncludedPrice(17000);
        Invoice newInvoice = invoice.issue();

        assertEquals(17000, (int) newInvoice.getTaxIncludedPrice());
        assertEquals(810, (int) newInvoice.getVAT());
        assertEquals(16190, (int) newInvoice.getTaxExcludedPrice());
        assertEquals(0.05, newInvoice.getVatRate(), 0.001);


        newInvoice.setTaxIncludedPrice(105);
        assertEquals(105, (int) newInvoice.getTaxIncludedPrice());
        assertEquals(5, (int) newInvoice.getVAT());
        assertEquals(100, (int) newInvoice.getTaxExcludedPrice());
        assertEquals(0.05, newInvoice.getVatRate(), 0.001);
    }


    @Test
    public void issuing_an_invoice_is_not_necessary_to_calculate_VAT_and_tax_excluded_price(){

        Invoice invoice = new Invoice();
        invoice.setVatRate(0.05);
        invoice.setTaxIncludedPrice(17000);
        assertEquals(17000, (int) invoice.getTaxIncludedPrice());
        assertEquals(810, (int) invoice.getVAT());
        assertEquals(16190, (int) invoice.getTaxExcludedPrice());
        assertEquals(0.05, invoice.getVatRate(), 0.001);

        invoice.setTaxIncludedPrice(105);
        assertEquals(105, (int) invoice.getTaxIncludedPrice());
        assertEquals(5, (int) invoice.getVAT());
        assertEquals(100, (int) invoice.getTaxExcludedPrice());
        assertEquals(0.05, invoice.getVatRate(), 0.001);

    }

}
