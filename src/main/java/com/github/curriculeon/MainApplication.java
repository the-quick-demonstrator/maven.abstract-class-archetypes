package com.github.curriculeon;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        Greeter leonGreeter = new Greeter("Leon");
        leonGreeter.greet(); // prints out "Hello Leon!"
        leonGreeter.welcome();
    }
}
