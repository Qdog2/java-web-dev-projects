package org.launchcode;

public class HelloWorld {
    private String message = "Hello World";

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String aMessage) {
        message = aMessage;
    }

}
