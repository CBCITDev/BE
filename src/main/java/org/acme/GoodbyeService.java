package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GoodbyeService {

    public String sayGoodbye(String name) {
        return "Goodbye " + name;
    }
}