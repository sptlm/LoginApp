package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSource {
    public static double input() throws ZeroInputException, ArithmeticException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        double f = scanner.nextDouble();

        if ((int)f == 0){
            throw new ZeroInputException();
        }
        return f;
    }
}
