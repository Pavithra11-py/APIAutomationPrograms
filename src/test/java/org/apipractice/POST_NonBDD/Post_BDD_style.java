package org.apipractice.POST_NonBDD;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

public class Post_BDD_style {
     @Test
     @Description("Test using BDD style")

    public void BDD_stle() {
         String payload = "{\n" +
                 "  \"username\" : \"admin\",\n"+
                 " \"password\" : \"password123\"\n"+
                 "}";
        //TC-1
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
         .contentType(ContentType.JSON)

              .log().all().body(payload)
                 .when().log().all().post()
                .then().log().all().statusCode(200);

    }
}