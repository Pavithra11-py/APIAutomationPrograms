package org.apipractice.RA_TestNG_Allure;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class Testcase_TestNG_006 {
    String pincode = "110048";

    @Test
    @Description("TC#1 verify with pincode-110048 ")
    public void positive_tc_01() {
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/" + pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }

    @Test
    @Description("TC#2 verify with invalid pincode -1")
    public void negative_tc_02() {
        pincode = "-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/" + pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }

    @Test
    @Description(" TC#3 verify with invalid $ ")
    public void negt_tc_03() {
        pincode = "";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/" + "$")
                .when().get()
                .then().log().all().statusCode(200);
    }

}
