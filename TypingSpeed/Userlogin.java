package TypingSpeed;

import java.util.HashMap;
import java.util.Scanner;

public class Userlogin {
    HashMap<String, String> users;

    public void Login(HashMap<String, String> users) {
        this.users = users;
    }

    public void loginUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = input.nextLine();

        System.out.print("Enter your password: ");
        String password = input.nextLine();

        if (users.containsKey(username)) {
            if (users.get(username).equals(password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password. Try again!");
            }
        } else {
            System.out.println("User does not exist. Please register!");
        }
    }
}
