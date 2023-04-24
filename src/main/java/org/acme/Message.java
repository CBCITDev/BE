package org.acme;

public class Message {
    private String messageText;

    Message() {
        messageText = "Hello from RESTEasy Reactive";
    }

    Message(String name) {
        messageText = "Hello " + name;
    }

    public String getMessage() {
        return messageText;
    }
}
