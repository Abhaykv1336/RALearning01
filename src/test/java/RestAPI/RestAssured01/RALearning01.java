package RestAPI.RestAssured01;

import io.restassured.RestAssured;

public class RALearning01 {
    public static void main(String[] args) {

        //RestAssured Hello World Program
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com/ping").basePath("/ping")
                .when().get().then().statusCode(404);
    }
}
