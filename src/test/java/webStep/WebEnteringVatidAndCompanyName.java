package webStep;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * Created by jay on 2017/4/17.
 */
public class WebEnteringVatidAndCompanyName {
    private final WebDriver driver = new ChromeDriver();

    @Given("^I am on the google browser$")
    public void iAmOnTheGoogleBrowser(){
        driver.get("http://localhost:4567/invoice");
    }

    @When("^I enter the company name \"([^\"]*)\" in company name field$")
    public void iEnterTheCompanyNameInCompanyNameField(String companyName){
        WebElement element = driver.findElement(By.name("companyName"));
        element.sendKeys(companyName);
//        String arr[] = companyName.split("");
//        for(String s: arr){
//            element.sendKeys(s);
//        }
        element.submit();
    }
    @Then("^I should see the VAT ID field show \"([^\"]*)\" in browser$")
    public void iShouldSeeTheVATIDFieldShow(String vatid){

        assertThat(driver.findElement(By.name("vatid")).getAttribute("value"),is(vatid));
    }

    @When("^I enter the VAT ID \"([^\"]*)\" in VAT ID field$")
    public void iEnterTheVATIDInVATIDField(String vatid){
        WebElement element = driver.findElement(By.name("vatid"));
        element.sendKeys(vatid);
//        String arr[] = vatid.split("");
//        for(String s: arr){
//            element.sendKeys(s);
//        }
        element.submit();
    }

    @Then("^I should see the company name field show \"([^\"]*)\" in browser$")
    public void iShouldSeeTheCompanyNameFieldShow(String companyName){
        assertThat(driver.findElement(By.name("companyName")).getAttribute("value"),is(companyName));
    }

    @cucumber.api.java.After
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
