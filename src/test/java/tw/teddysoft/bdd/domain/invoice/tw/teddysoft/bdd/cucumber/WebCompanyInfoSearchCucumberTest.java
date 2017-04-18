package tw.teddysoft.bdd.domain.invoice.tw.teddysoft.bdd.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import step.Hook;
import tw.teddysoft.bdd.web.app.InvoiceWeb;

/**
 * Created by jay on 2017/4/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/web_entering_vatid_and_company_name.feature",
        glue = {"webStep"},
        format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"}
)
public class WebCompanyInfoSearchCucumberTest {

}
