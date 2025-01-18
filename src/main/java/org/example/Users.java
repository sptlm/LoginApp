package org.example;

import java.util.Objects;

public class Users {
    static class User{
        String login;
        String password;
        Role role;

        public User(String login, String password, Role role) {
            this.login = login;
            this.password = password;
            this.role = role;
        }
    }
    static User admin = new User("Admin_Login1234567890", "admin12345", Role.ADMIN);
    static User user = new User("User_Login1234567890", "user12345", Role.USER);
    private static String adminLogin = "Admin_Login1234567890";
    private static String adminPassword = "admin12345";
    private static String userLogin = "User_Login1234567890";
    private static String userPassword = "user12345";

    public String getAdminLogin() {
        return adminLogin;
    }

    public void setAdminLogin(String adminLogin) {
        this.adminLogin = adminLogin;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public enum Role{
        ADMIN,USER

    }

    public static Object userCheck(String login,String password){
        if (login.equals(admin.login) & password.equals(admin.password)){
            return Role.ADMIN;
        }
        if (login.equals(user.login) & password.equals(user.password)){
            return Role.USER;
        }
        return null;
    }
}
