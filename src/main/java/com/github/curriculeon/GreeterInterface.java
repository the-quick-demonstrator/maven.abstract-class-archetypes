package com.github.curriculeon;

// purpose of an interface is to couple an object to a behavior
public interface GreeterInterface {

    String getInput();
    default void greet() {
        System.out.println("Hello " + getInput() + "!");
    }

    default void welcome() {
        System.out.println("Welcome, " + getInput() + " to the application!");
        System.out.println("We hope you have a good time!");
        System.out.println("---------------------------------");
    }
}

