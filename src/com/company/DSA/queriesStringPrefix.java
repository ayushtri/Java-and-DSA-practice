package com.company.DSA;

import java.util.Scanner;

class Solution1{
    public void queries(String[] Str, int[] Wi, String r){
        int sum=0;
        for(int i=0;i<Str.length;i++){
            if(Str[i].startsWith(r)){
                sum+=Wi[i];
            }
        }
        System.out.println(sum);
    }
    public void check(String[] Str, int[] Wi, String[] R){
        for(int i=0;i<R.length;i++){
            queries(Str, Wi, R[i]);
        }
    }
}

public class queriesStringPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        String[] Str = new String[N];
        int[] Wi = new int[N];
        for(int i=0;i<N;i++){
            Str[i] = sc.next();
            Wi[i] = sc.nextInt();
            if(Str[i].length()!=S){
                System.out.println("Invalid Input");
                break;
            }
        }
        int Q = sc.nextInt();
        String[] R = new String[Q];
        for(int i=0;i<Q;i++){
            R[i] = sc.next();
        }
        Solution1 s = new Solution1();
        s.check(Str,Wi,R);
    }
}
