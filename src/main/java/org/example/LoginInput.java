package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginInput {
    public static String input() throws WrongLoginException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String line = scanner.nextLine();
        Matcher matcherLogin = Pattern.compile("[a-zA-Z@_\\d.-]{20,}").matcher(line);
        if (matcherLogin.matches()){
            return line;
        }else{
            throw new WrongLoginException();
        }
    }
}
