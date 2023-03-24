package TypingSpeed;

import java.util.HashMap;
import java.util.Scanner;

public class Register {
    HashMap<String, String> users = new HashMap<>();

    public void registerUser() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your username: ");
            String username = input.nextLine();

            System.out.print("Enter your password: ");
            String password = input.nextLine();

            users.put(username, password);
        }

        System.out.println("User registered successfully!");
    }
}
 
