package TypingSpeed;

import java.util.Scanner;

import s2java.usertyping;

public class Landing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option; 
        System.out.print("Welcome to typing test");
        System.out.println("Please choose option below");
        option = sc.next();
        switch (option){
            case "1":
            Register.main(args);
            case "2":
            Userlogin.main(args);
            case "3":
            ResetPw.main(args);
            case "4":
            usertyping.main(args);
            case "5":
            ResultList.main(args);
            


             
        }


    }
}
