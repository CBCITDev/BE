package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public Message greeting(String name) {
        return new Message(name);
        // "{ \"messageText\": \"Hello " + name+ "\" }";
    }

}