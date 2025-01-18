package org.example;
/*
### Задача

Разработать программу которая выводит меню для авторизованного пользователя,
при неверной авторизации по логину и паролю необходимо запросить новый ввод логина и пароля.
Отказ от авторизации и завершение программы - ввод exit вместо логина

Login должен содержать не менее 20 символов: латинскиx букв прописных и строчных, цифр и символов @ . _ -
Если Login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
Password должен содержать не менее 8 символов: латинские буквы, цифры и {}[](),.;&?!_-+
Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.

Используем multi-catch block.

Проверку осуществляем в отдельном методе userCheck.
Метод возвращает роль пользователя (Enum: ADMIN, USER), если значения верны или null в другом случае.
В сигнатуре метода прописать возможные исключения.

Логин и пароль сверять с предопределенными константами

в программе два пользователя с двумя различными ролями

для каждой роли выводить свое меню

ADMIN:
1. File
2. Create new user
3. exit

USER:
1. File
2. Get play list
3. exit


выход по команде exit
 */
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loggedIn = false;
        while (true) {
            while (!loggedIn) {
                try {
                    String login = LoginInput.input();
                    String password = PasswordInput.input();
                    if (Users.userCheck(login,password) == Users.Role.ADMIN) {
                        System.out.println("1. File\n" +
                                "2. Create new user\n" +
                                "3. exit");
                        loggedIn = true;
                    } else if (Users.userCheck(login,password) == Users.Role.USER) {
                        System.out.println("1. File\n" +
                                "2. Get play list\n" +
                                "3. exit");
                        loggedIn = true;
                    }else{
                        System.out.println("Неверно введен логин и пароль, повторите попытку входа");
                    }
                }catch (WrongLoginException e){
                System.out.println(e);
                }catch (WrongPasswordException e){
                System.out.println(e);
                }
            }
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("exit")){
                System.out.println("Вы вышли из аккаунта");
                loggedIn = false;
            }
        }
    }
}