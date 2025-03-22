package org.apipractice.Basics;

import io.restassured.RestAssured;

public class Multpletestcases_005 {
    public static void main(String[] args) {
        String pincode = "110048";
        //TC-1
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);

        //TC-2
        pincode = "-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);

        //TC-3
        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);

        //TC-4
        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);

        //TC-5
        pincode = "Pavithra";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);

        //TC-6
        pincode = "";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("USA/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
}
