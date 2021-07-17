package echo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class EchoTest {
    @Test
    void shouldReturnEcho() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body()
        ;
    }

}
