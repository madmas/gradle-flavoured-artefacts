package com.karakun.sample;


public class Application {
    public static void main(String[] args) {
        String s = new CustomDataProvider().sampleMethod();
        System.out.println("s = " + s);
    }
}
