package org.example;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException() {
        super("Password должен содержать не менее 8 символов: латинские буквы, цифры и {}[](),.;&?!_-+");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
