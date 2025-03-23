package org.apipractice.Assertions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import org.hamcrest.Matchers;

public class RestAssur_default_assertions {

    RequestSpecification rs;
    ValidatableResponse vr;
    Response r;

    String Token;
    Integer BookingId;

    @Test
    public void test_POST(){

        String payload_POST = "{\n" +
                "    \"firstname\" : \"Josh\",\n" +
                "    \"lastname\" : \"Allen\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

         rs = RestAssured.given();
         rs.baseUri("https://restful-booker.herokuapp.com");
         rs.basePath("/booking/4088");

        Response r = rs.when().post();
        //get validatable response to validate
         vr = r.then().log().all();
        //Restassured
         vr.statusCode(200);
         //RestAssured -> import hamster
        //firstamname = pavithra, lastname= panduga, bookingid should not be null (3) price  1113

        vr.body("firstname",Matchers.equalTo("Josh") );
        vr.body("lastname",Matchers.equalTo("Allen") );
        vr.body("depositpaid",Matchers.equalTo("true") );
        vr.body("bookingid",Matchers.notNullValue());

    }














}
