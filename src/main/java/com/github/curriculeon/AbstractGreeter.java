package com.github.curriculeon;

// purpose of an abstract class is to couple an object to construction
abstract public class AbstractGreeter implements GreeterInterface {
    private final String persistentInput;

    public AbstractGreeter(String input) {
        this.persistentInput = input;
    }

    @Override
    public String getInput() {
        return persistentInput;
    }
}
