package org.acme;

import org.junit.jupiter.api.Test;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestHTTPEndpoint(GoodbyeResource.class)
public class GoodbyeResourceTest {
    
    @Test
    public void testGoodbyeEndpoint() {
        given()
            .when().get()
                .then()
                    .statusCode(200)
                    .body(is("Goodbye"));
    }
}
