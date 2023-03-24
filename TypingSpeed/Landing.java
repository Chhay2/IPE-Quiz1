package TypingSpeed;

import java.util.Scanner;


public class Landing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option; 
        System.out.println("Welcome to typing test");
        System.out.println("Please choose option below");
        System.out.println("1.Regiseration\n2.Login\n3.Reset Password\n4.Typing\n5.Result list");
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
