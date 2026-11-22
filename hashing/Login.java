package hashing;

import java.util.Scanner;

public class Login {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the user name : ");
        String name = sc.next();

        System.out.println("enter the password : ");
        String password = sc.next();

        HashMapDemo hmd = new HashMapDemo();
        String check = hmd.validateEntry(name,password);

        if(check.equals("valid")){
            System.out.println("valid name and password");
        }else{
            System.out.println("invalid password");
        }
    }
}
