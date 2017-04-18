package step;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import tw.teddysoft.bdd.domain.invoice.support.Utility;
import tw.teddysoft.bdd.web.app.InvoiceWeb;

public class Hook {

    private boolean WebOpen = false;
    @Before
    public void beforeScenario(Scenario scenario){
        if (Utility.isUnderInvoiceWebMode())
            InvoiceWeb.main(new String [0]);
    }

    @Before("@OpenWeb")
    public void beforeOpenWeb(Scenario scenario){
        System.out.println(scenario.getName());
        if(!WebOpen){
            InvoiceWeb.main(new String [0]);
        }
    }

    @After
    public void afterScenario(Scenario scenario){
    }



}
