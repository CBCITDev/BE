package org.acme;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class StaticContentTest {

    @TestHTTPEndpoint(GreetingResource.class)
    @TestHTTPResource
    URL urlHello;

    @TestHTTPEndpoint(GoodbyeResource.class)
    @TestHTTPResource
    URL urlGoodbye;

    @Test
    public void testHello() throws IOException{
        try (InputStream in = urlHello.openStream()) {
            String contents = new String(in.readAllBytes(), StandardCharsets.UTF_8);
            Assertions.assertEquals("Hello from RESTEasy Reactive", contents);;
        }
    }

    @Test
    public void testGoodbye() throws IOException{
        try (InputStream in = urlGoodbye.openStream()) {
            String contents = new String(in.readAllBytes(), StandardCharsets.UTF_8);
            Assertions.assertEquals("Goodbye", contents);;
        }
    }

}