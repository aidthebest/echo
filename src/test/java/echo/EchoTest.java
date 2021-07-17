package echo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class EchoTest {
    @Test
    void shouldReturnEcho() {
        given()
                .baseUri("https://postman-echo.com")
                .body("testXXX")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("testXXX"))
        ;
    }

}
