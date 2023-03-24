package TypingSpeed;

import java.util.Scanner;
public class Userlogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter name: ");
        String name = sc.nextLine();
        System.out.printf("Enter password: ");
        String pass = sc.nextLine();
        String pass1 = pass;
        if(pass == pass1){
            System.out.printf("Login successful, Welcome " + name);
        }
    }
}
