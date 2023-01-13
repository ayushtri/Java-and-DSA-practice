package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class test {

    static boolean isPrime(int n){
        if(n==1 || n==0){
            return false;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static int sumFirst(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    static void fibUpto(int n){
        if(n<=1){
            System.out.println(n);
            return;
        }
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+",");
        }
    }
    static void reverseNum(int n){
        int rev = 0;
        int rem;
        while(n!=0){
            rem=n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        System.out.println(rev);
    }
    static boolean palindrome(int n){
        int temp = n;
        int rev = 0;
        int rem;
        while(n!=0){
            rem=n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        if(rev==temp) return true;
        return false;
    }
    static boolean armstrongNum(int n){
        int temp = n;
        int order = 0;
        while(temp!=0){
            temp=temp/10;
            order++;
        }
        int temp1 = n;
        int check, sum=0;
        while(temp1!=0){
            check=temp1%10;
            sum+=Math.pow(check,order);
            temp1=temp1/10;
        }
        return sum == n;

    }
    static boolean anagram(String s1, String s2){
        char[] str1=s1.toLowerCase().toCharArray();
        char[] str2=s2.toLowerCase().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
    static int frequencyOfGiven(String s1, char a){
        int freq=0;
        for(int i=0; i<s1.length();i++){
            if(s1.charAt(i)==a) freq++;
        }
        return freq;
    }
    static void frequencyAll(String s){
        int[] freq = new int[128];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }
        for(int i = 0; i<freq.length ; i++){
            if(freq[i]!=0) System.out.println((char)i+"->"+freq[i]);
        }
    }
    static String firstLastCaps(String s){
        String[] str = s.split("\\s");
        String newString = "";
        for(int i=0;i<str.length;i++){
            int length = str[i].length();
            if(length<=1) newString = newString + str[i].toUpperCase() + " ";
            else {
                String firstChar = str[i].substring(0, 1);
                String restChar = str[i].substring(1, length - 1);
                String lastChar = Character.toString(str[i].charAt(length - 1));
                newString = newString + firstChar.toUpperCase() + restChar + lastChar.toUpperCase() + " ";
            }
        }
        return newString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        /*for(int i=0;i<n;i++){
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }*/
////        System.out.println(sumFirst(n));
////        fibUpto(n);
//        reverseNum(n);
//        System.out.println( palindrome(n));
        int count = 1;
        for(int i = 0; i<5;i++){
            for(int j = 0; j<i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        int c=0;
        for(int i = 0; i<5;i++){
            for(int j =5-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j = 0; j<=i+c;j++){
                System.out.print(" *");
            }
            c++;
            System.out.println();
        }
        for(int i = 5; i>=0;i--){
            for(int j =5-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j = 0; j<=i+c;j++){
                System.out.print(" *");
            }
            c--;
            System.out.println();
        }
        System.out.println("----------");
        for(int i = 0; i<5;i++){
            for (int j = 0; j<i;j++){
                System.out.print(" ");
            }
            for(int j = 0; j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=5 ;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(armstrongNum(371));
        System.out.println(anagram("Dog","God"));
        System.out.println(frequencyOfGiven("prepinsta",'p'));
        frequencyAll("prepinsta");
        System.out.println(firstLastCaps("apple is a fruit"));
    }
}
