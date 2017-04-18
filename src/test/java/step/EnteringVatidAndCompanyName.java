package step;

import com.mashape.unirest.http.exceptions.UnirestException;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tw.teddysoft.bdd.domain.invoice.VatidAndCompanyName;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * Created by jay on 2017/4/13.
 */
public class EnteringVatidAndCompanyName {
    String vatid;
    String companyName;
    @When("^I enter the VAT ID \"([^\"]*)\"$")
    public void iEnterTheVATID(String vatid){
        this.vatid = vatid;
    }

    @Then("^I should see the company name \"([^\"]*)\"$")
    public void iShouldSeeTheCompanyName(String companyName) throws UnirestException {
        assertThat(VatidAndCompanyName.getCompanyName(vatid), is( companyName ));
    }

    @When("^I enter the company name \"([^\"]*)\"$")
    public void iEnterTheCompanyName(String companyName) {this.companyName = companyName;}

    @Then("^I should see the VAT ID \"([^\"]*)\"$")
    public void iShouldSeeTheVATID(String vatid) throws UnirestException {
        assertThat(VatidAndCompanyName.getVatid(companyName), is( vatid ));
    }

}
