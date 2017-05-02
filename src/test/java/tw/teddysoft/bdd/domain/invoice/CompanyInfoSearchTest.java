package tw.teddysoft.bdd.domain.invoice;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import tw.teddysoft.bdd.domain.invoice.CompanyInfoSearch;

import static org.assertj.core.api.Assertions.assertThat;
/**
 * Created by jay on 2017/4/17.
 */
public class CompanyInfoSearchTest {
    @Test
    public void company_name_should_be_teddysoftware_when_vatid_is_53909614() throws UnirestException {
        Assertions.assertThat(CompanyInfoSearch.getCompanyName("53909614")).isEqualTo("泰迪軟體科技有限公司");
    }

    @Test
    public void company_name_should_get_商業名稱_東方視聽社_when_vatid_is_11111111() throws UnirestException{
        Assertions.assertThat(CompanyInfoSearch.getCompanyName("11111111")).isEqualTo("東發視聽社");
    }

    @Test
    public void company_name_should_get_名稱_國立臺北科技大學_when_vatid_is_92021164() throws UnirestException{
        Assertions.assertThat(CompanyInfoSearch.getCompanyName("92021164")).isEqualTo("國立臺北科技大學");
    }

    @Test
    public void company_name_should_get_統一編號錯誤_when_vatid_is_999999999() throws UnirestException{
        Assertions.assertThat(CompanyInfoSearch.getCompanyName("999999999")).isEqualTo("統一編號錯誤");
    }

    @Test
    public void noInternet()throws UnirestException{
        Assertions.assertThat(CompanyInfoSearch.getCompanyName("27932771")).isEqualTo("查無公司");
    }

    @Test
    public void vatid_should_not_find_anything_when_company_name_is_泰迪軟體科技公司() throws UnirestException{
        assertThat(CompanyInfoSearch.getVatid("泰迪軟體科技公司")).isEqualTo("查無資料");
    }

    @Test
    public void vatid_should_be_53909614_when_company_name_is_teddysoftware() throws UnirestException {
        assertThat(CompanyInfoSearch.getVatid("泰迪軟體科技有限公司")).isEqualTo("53909614");
    }

    @Test
    public void vatid_should_found_1515261_data_when_company_name_is_公司() throws UnirestException {
        assertThat(CompanyInfoSearch.getVatid("公司")).isEqualTo("共有1515261筆資料");
    }
}
