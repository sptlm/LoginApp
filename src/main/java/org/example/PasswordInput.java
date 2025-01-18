package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordInput {
    public static String input() throws WrongPasswordException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String line = scanner.nextLine();
        Matcher matcherPassword = Pattern.compile("[a-zA-Z\\d{}\\[\\](),.;&?!_\\-+]{8,}").matcher(line);
        if (matcherPassword.matches()){
            return line;
        }else{
            throw new WrongPasswordException();
        }
    }
}
