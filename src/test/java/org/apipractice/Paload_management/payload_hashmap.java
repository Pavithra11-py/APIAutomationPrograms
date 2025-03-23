package org.apipractice.Paload_management;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class payload_hashmap {

    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;
    String Token;
    Integer bookingid;
    @Test
    public  void Test_Post() {
//        String payload_POST = "{\n" +
//                "    \"firstname\" : \"Josh\",\n" +
//                "    \"lastname\" : \"Allen\",\n" +
//                "    \"totalprice\" : 111,\n" +
//                "    \"depositpaid\" : true,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2018-01-01\",\n" +
//                "        \"checkout\" : \"2019-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Breakfast\"\n" +
//                "}";

        Map<String,Object> jsonbodusingMap = new LinkedHashMap();
        jsonbodusingMap.put("firstname","Josh");
        jsonbodusingMap.put("lastname","Allen");
        jsonbodusingMap.put("totalprice",111);
        jsonbodusingMap.put("depositpaid",true);

        Map<String,Object> bookingdateMap = new LinkedHashMap();
        bookingdateMap.put("checkin","2018-01-01");
        bookingdateMap.put("checkout","2019-01-01");

        jsonbodusingMap.put("bookingdates",bookingdateMap);
        jsonbodusingMap.put("additionalneeds","Breakfast");

        System.out.println("Json body using MAP");
    }

}
