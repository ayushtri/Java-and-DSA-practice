package com.company;

import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("a: ");
        a= sc.nextInt();
        System.out.print("b: ");
        b= sc.nextInt();
        try{
            c=a/b;
            System.out.println("a/b: "+c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}
