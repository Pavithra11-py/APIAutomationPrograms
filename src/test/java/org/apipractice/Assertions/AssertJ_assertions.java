package org.apipractice.Assertions;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.AssertionsKt.assertAll;

public class AssertJ_assertions {


    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;
    String Token;
    Integer bookingid;
@Test
    public  void Test_Post() {
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


        bookingid = r.then().extract().path("bookingid");
        String firstname = r.then().extract().path("booking.firstname");
        String lastname = r.then().extract().path("booking.lastname");
    Assert.assertNotNull(bookingid);
    Assert.assertEquals(firstname , "Josh");
    Assert.assertEquals(lastname , "Allen");


    SoftAssert asserts = new SoftAssert();
    asserts.assertEquals(firstname, "Pramod" );
    asserts.assertAll();



    //3rd lib to assertions
    assertThat(bookingid).isNotNull().isNotZero().isPositive();
    assertThat(firstname).isEqualTo("Josh").isNotEmpty().isNotNull().isNotBlank();




    }
}
