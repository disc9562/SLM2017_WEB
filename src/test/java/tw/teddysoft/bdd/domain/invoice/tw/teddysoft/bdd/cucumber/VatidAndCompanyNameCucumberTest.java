package tw.teddysoft.bdd.domain.invoice.tw.teddysoft.bdd.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jay on 2017/4/14.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/entering_vatid_and_company_name.feature",
        glue = {"step"},
        format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"}
)
public class VatidAndCompanyNameCucumberTest {

}
