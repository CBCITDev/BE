package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GoodbyeServiceTest {
    @Inject
    GoodbyeService service;

    @Test
    public void testSayGoodbyeEndpoint() {
        assertEquals("Goodbye testname", service.sayGoodbye("testname"));
    }
}
