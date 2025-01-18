package org.example;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException() {
        super("Login должен содержать не менее 20 символов: латинскиx букв прописных и строчных, цифр и символов @ . _ -");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
