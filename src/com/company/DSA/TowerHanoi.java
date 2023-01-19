package com.company.DSA;

public class TowerHanoi {
    static void TOH(int n,String source, String helper, String destination){
        if(n==1){
            System.out.println("Transfer "+n+" disk from "+source+" to "+destination);
            return;
        }
        TOH(n-1,source, destination, helper);
        System.out.println("Transfer "+n+" disk from "+source+" to "+destination);
        TOH(n-1,helper,source,destination);
    }
    public static void main(String[] args) {
        TOH(3,"A","B","C"); //TC=O(2^n);
    }
}
