package org.apipractice.GET_BDD;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.jsoup.Connection;
import org.junit.jupiter.api.Test;

public class NonBDD_stle_tcs {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    @Description("#TC-1 verify pincode - 560061")
    public void test_Non_BDD() {
        String pincode = "560061";
        r= RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("IN/" + pincode);
         response = r.when().log().all().get();
          vr = response.then().log().all().statusCode(200);
    }

    @Test
    @Description("#TC-2 verif with -1")
    public void Negative_tc()
    {
        String pincode = "-1";
        r= RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("IN/" + pincode);
        response = r.when().log().all().get();
        vr = response.then().log().all().statusCode(200);
    }

}
