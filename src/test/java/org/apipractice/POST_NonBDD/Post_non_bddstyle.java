package org.apipractice.POST_NonBDD;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;


public class Post_non_bddstyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    @Description("#TC-1 verify pincode - 560061")
    public void test_Non_BDD_create_token() {
          String payload = "{\n" +
              "  \"username\" : \"admin\",\n"+
               " \"password\" : \"password123\"\n"+
             "}";

        String pincode = "560061";

        // pre condition - preparing request
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);

        r.body(payload);
        //making http request
        response = r.when().log().all().post();

        //verification
        vr = response.then().log().all().statusCode(200);
    }
}