package tw.teddysoft.bdd.domain.invoice;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by jay on 2017/4/13.
 */
public class VatidAndCompanyName {
    public static String getCompanyName(String vatid) throws UnirestException {

        HttpResponse<JsonNode> jsonResponse = Unirest.post("http://company.g0v.ronny.tw/api/show/{vatid}")
                .header("accept", "application/json")
                .routeParam("vatid", vatid)
                .asJson();

        JSONObject obj = (JSONObject) jsonResponse.getBody().getObject().get("data");
        String companyName = obj.get("公司名稱").toString();
        return companyName;
    }

    public static String getVatid(String companyName) throws UnirestException {
        HttpResponse<JsonNode> jsonResponse = Unirest.post("http://company.g0v.ronny.tw/api/search")
                .header("accept", "application/json")
                .queryString("q",companyName)
                .asJson();

        JSONArray jsonArray = (JSONArray) jsonResponse.getBody().getObject().get("data");
        JSONObject obj = jsonArray.getJSONObject(0);
        String vatid = obj.get("統一編號").toString();
        return vatid;
    }
}
