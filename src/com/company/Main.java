package com.company;

import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr= new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.print("a["+i+"]: ");
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("a["+i+"]: "+arr[i]);
        }
    }
}
