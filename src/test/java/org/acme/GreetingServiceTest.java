package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import javax.inject.Inject;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingServiceTest {
    @Inject
    GreetingService service;

    @Test
    public void testGreetingEndpoint() {
        assertEquals( "Hello testname", service.greeting("testname").getMessage());
    }
}
