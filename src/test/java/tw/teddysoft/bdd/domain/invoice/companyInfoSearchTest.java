package tw.teddysoft.bdd.domain.invoice;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Test;
import tw.teddysoft.bdd.domain.invoice.VatidAndCompanyName;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.Matchers.*;
import static org.assertj.core.api.Assertions.assertThat;
/**
 * Created by jay on 2017/4/17.
 */
public class companyInfoSearchTest {
    @Test
    public void company_name_should_be_teddysoftware_when_vatid_is_53909614() throws UnirestException {
        assertThat(VatidAndCompanyName.getCompanyName("53909614")).isEqualTo("泰迪軟體科技有限公司");
    }

    @Test
    public void vatid_should_be_53909614_when_company_name_is_teddysoftware() throws UnirestException {
        assertThat(VatidAndCompanyName.getVatid("泰迪軟體科技有限公司")).isEqualTo("53909614");
    }
}
