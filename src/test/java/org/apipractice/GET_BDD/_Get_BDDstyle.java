package org.apipractice.GET_BDD;

import io.restassured.RestAssured;

public class _Get_BDDstyle {
    public void test_BDD_style() {
        String pincode = "560061";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/" + pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
}
