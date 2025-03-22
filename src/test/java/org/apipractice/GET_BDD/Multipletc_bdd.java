package org.apipractice.GET_BDD;

import io.restassured.RestAssured;

public class Multipletc_bdd {
    public void test_BDD_style1() {
        String pincode = "560061";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/" + pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
    public void test_BDD_style2() {
        String pincode = "460068";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/" + pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
    public void test_BDD_style3() {
        String pincode = "-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/" + pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
    public void test_BDD_style4() {
        String pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/" + pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
}
