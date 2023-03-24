package TypingSpeed;

import java.util.Scanner;

public class ResetPw {
    public static void main(String[] args) {
        System.out.println("Reset password");
        System.out.println("-------------------");
        try (Scanner sc = new Scanner(System.in)) {
            String Old, New; 
            System.out.print("Insert old password:");
            Old = sc.nextLine();
            System.out.print("Insert new password:");
            New = sc.nextLine();
        }
        System.out.println("The password is resetted");
    }
}
