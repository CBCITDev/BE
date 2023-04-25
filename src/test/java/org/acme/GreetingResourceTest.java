package org.acme;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.UUID;

@QuarkusTest
@TestHTTPEndpoint(GreetingResource.class)
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get()
          .then()
             .statusCode(200)
             .body(is( "{\"message\":\"Hello from RESTEasy Reactive\"}")); 
    }

    @Test
    public void testHelloNameEndpoint () {
        String newName = UUID.randomUUID().toString();
        given()
            .pathParam("name", newName)
            .when().get("greeting/{name}")
                .then()
                    .statusCode(200)
                    .body(is( "{\"message\":\"Hello "+ newName + "\"}"));
    }

}