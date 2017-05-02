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
public class CompanyInfoSearch {
    public static String getCompanyName(String vatid) throws UnirestException {

        try{
            String companyName = "";
            HttpResponse<JsonNode> jsonResponse = Unirest.post("http://company.g0v.ronny.tw/api/show/{vatid}")
                    .header("accept", "application/json")
                    .routeParam("vatid", vatid)
                    .asJson();

            if(jsonResponse.getBody().getObject().has("error"))
                return "統一編號錯誤";

            JSONObject obj = (JSONObject) jsonResponse.getBody().getObject().get("data");

            if(obj.has("商業名稱")){
                companyName = obj.get("商業名稱").toString();
            }
            else if(obj.has("名稱")){
                companyName = obj.get("名稱").toString();
            }
            else if(obj.has("公司名稱")){
                companyName = obj.get("公司名稱").toString();
            }
            else{
                companyName = "查無公司";
            }

            return companyName;
        }catch (UnirestException e){
            return "網路錯誤";
        }
    }

    public static String getVatid(String companyName) throws UnirestException {
        try {
            String vatid = "";
            HttpResponse<JsonNode> jsonResponse = Unirest.post("http://company.g0v.ronny.tw/api/search")
                    .header("accept", "application/json")
                    .queryString("q",companyName)
                    .asJson();

            int found =  jsonResponse.getBody().getObject().getInt("found");

            if(found == 0){
                vatid = "查無資料";
            }
            else if(found == 1){
                JSONArray jsonArray = (JSONArray) jsonResponse.getBody().getObject().get("data");
                JSONObject obj = jsonArray.getJSONObject(0);
                vatid = obj.get("統一編號").toString();
            }
            else{
                vatid = "共有" + found + "筆資料";
            }

            return vatid;
        }catch (UnirestException e){
            return "網路錯誤";
        }
    }
}
