package org.example;

public class ZeroInputException extends RuntimeException{
    public ZeroInputException() {
        super("Целая часть равна 0");
    }

    public ZeroInputException(String message) {
        super(message);
    }
}
