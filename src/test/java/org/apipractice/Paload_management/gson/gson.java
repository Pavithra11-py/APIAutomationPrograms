package org.apipractice.Paload_management.gson;

import com.google.gson.Gson;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class gson {
    // add dependenc of gson lib into pom.xl to install gson
    //gson is a  google lib
    // which converts class to JSON and also JSON to class
    // JSON - is a plain text in a ke - value pair to transfer from client to server

    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;
    String Token;
    Integer bookingid;
    @Test
    public  void Test_create_booking_Postive() {

        // Step1 - POST
        // URL -> Base URI + base Path
        // HEADER
        // BODY
        // Auth - NO

        // Step 2
        // prepare the Payload ( Object -> JSON String)
        // send the request

        //Step 3
        // Validate Response ( JSON String -> Object)
        // FirstName,
        // Status Code
        // Time Response

    Booking booking = new Booking();
    booking.setFirstname("Jim");
    booking.setLastname("Brown");
    booking.setDepositpaid(true);

    Bookingdates bookindates  = new Bookingdates();
    bookindates.setCheckin("2018-01-01");
    bookindates.setCheckout("2019-01-01");
    booking.setBookingdates(bookindates);
      booking.setAdditionalneeds("Breakfast");

      //Now this is JAVA object (we can't transfer this to server directly)
        //  so convert java Object to JSON using gson

        Gson gson = new Gson();
       String jsonSTring = gson.toJson(booking);

        System.out.println(jsonSTring);


        //{"firstname":"Jim","lastname":"Brown","depositpaid":true,"bookingdates":{"checkin":"2018-01-01","checkout":"2019-01-01"},

        RequestSpecification r;
        Response response;
        ValidatableResponse vr;

            // pre condition - preparing request
            r = RestAssured.given();
            r.baseUri("https://restful-booker.herokuapp.com/");
            r.basePath("booking");
            r.contentType(ContentType.JSON);

            r.body(jsonSTring).log().all();
            //making http request
            response = r.when().post();
           String jsonresponse = response.asString();
            //verification
            vr = response.then().log().all().statusCode(200);


            //case1 of Extract()
           String firstname1 = response.then().extract().path("booking.firstname");
        System.out.println(firstname1);

        Assert.assertEquals(firstname1,"Jim");//TestNG assertion

        assertThat(firstname1).isNotNull().isNotEmpty().isEqualTo("Jim");

        // case 2 of extract() using jsonPath.getSTring() method

        JsonPath jsonpath= new JsonPath(response.asString());
           String bookingid = jsonpath.getString("bookingid");
        String firstname = jsonpath.getString("booking.firstname");
    String checkin = jsonpath.getString("booking.bookingdates.checkin");
        System.out.println(bookingid);
        System.out.println(firstname);
        System.out.println(checkin);

        // case 3 Deser (de serialization) extraction


    }

}
