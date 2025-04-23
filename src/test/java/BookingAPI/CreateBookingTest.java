package BookingAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.example.utils.JsonUtils;
import org.example.utils.RestUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CreateBookingTest {
    @Test
    public void postTest1() throws IOException {
//        String baseUri = "https://restful-booker.herokuapp.com/booking";
//        String body = PayLoads.getCreateBookingPayloadAsString();
        Map<String, Object> data = JsonUtils.readFromJsonAsMap("qa/BookingData.Json");
        String baseUri = data.get("endpoint").toString();
        Map<String, Object> body = PayLoads.getCreateBookingPayLoadAsMap();
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json");
        Response response = RestUtils.performPost(baseUri,body,headers);
        int statuscode = response.statusCode();
        Assert.assertEquals(statuscode, 200);
    }
}
