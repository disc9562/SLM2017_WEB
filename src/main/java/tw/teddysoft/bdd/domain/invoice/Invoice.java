package tw.teddysoft.bdd.domain.invoice;

/**
 * Created by teddy on 2017/3/2.
 */
public class Invoice {
    private Integer taxExcludedPrice = 0;
    private Double vatRate = 0.0;
    private Integer taxIncludedPrice = 0;
    private Integer vat = 0;

    public Invoice(Integer taxIncludedPrice, Double vatRate, Integer taxExcludedPrice, int vat) {
        this.taxIncludedPrice = taxIncludedPrice;
        this.vatRate = vatRate;
        this.taxExcludedPrice = taxExcludedPrice;
        this.vat = vat;
    }

    public Invoice() {}

    public void setVatRate(Double vatRate) {
        this.vatRate = vatRate;
    }

    public void setTaxIncludedPrice(Integer taxIncludedPrice) {
        this.taxIncludedPrice = taxIncludedPrice;
    }

    public Invoice issue() {
        return new Invoice(taxIncludedPrice, vatRate,
                getTaxIncludedPrice(), getVAT());
    }

    public Integer getTaxIncludedPrice() {
        return taxIncludedPrice;
    }

    public Integer getVAT() {
        return (int) Math.round(getTaxExcludedPrice() * vatRate);
    }

    public Double getVatRate() {
        return vatRate;
    }

    public Integer getTaxExcludedPrice() {
        return (int) Math.round(this.taxIncludedPrice / (1 + vatRate));
    }
}
