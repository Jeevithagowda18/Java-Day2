package Jeevitha;

import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "admin";
        String password = "password";
        
        System.out.println("Enter username:");
        String Username = scanner.next();
        
        System.out.println("Enter password:");
        String userPassword = scanner.next();

        if (Username.equals(username)) {
            if (userPassword.equals(password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Incorrect username.");
        }

        scanner.close();
    }
}

