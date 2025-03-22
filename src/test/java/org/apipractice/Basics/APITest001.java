package org.apipractice.Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITest001 {
    public static void main(String[] args) {

        // Gerkin syntax
        // given - pre req - url , headers, auth, body
        // when - http method, - get,post,put,patch
        //then - vailidation - 200ok, frstname, ...
        //https://api.zippopotam.us/IN/560016
        //base uri - https://api.zippopotam.us
        //base path - IN/560016

        // get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pincode");
        String pincode = sc.nextLine();

       RestAssured
               .given()
                   .baseUri("https://api.zippopotam.us")
                .basePath("IN/"+pincode)
                .when().get()
               .then().log().all().statusCode(200);


    }
}
