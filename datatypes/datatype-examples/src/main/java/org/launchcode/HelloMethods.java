package org.launchcode;

public class HelloMethods {

    public static void main(String[] args) {
        String message = Message.getMessage("de");
        String helloOnly = message.substring(0, message.indexOf(','));
        System.out.println(helloOnly);
    }

}