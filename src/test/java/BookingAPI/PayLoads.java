package BookingAPI;

import java.util.LinkedHashMap;
import java.util.Map;

public class PayLoads {
    public static  String getCreateBookingPayloadAsString(){
        String body = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        return body;
    }

    public static Map<String, Object> getCreateBookingPayLoadAsMap(){
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("firstname","jim");
        data.put("lastname","Brown");
        data.put("toatalprice", "111");
        data.put("depositpaid", "true");
        Map<String, Object> bookingdates = new LinkedHashMap<>();
        bookingdates.put("checkin", "2018-01-01");
        bookingdates.put("checkout", "2019-01-01");

        data.put("bookingdates", bookingdates);
        data.put("additionalneeds", "Breakfast");
        return data;
    }
}
