package com.company;

public class TaylorsSeriesRecursion {
    static int e(int x, int n){
        int p=1,f=1,r;
        if(n==0) return 1;
        else{
            r=e(x,n-1);
            p=p*x;
            f=f*n;
            return r+p/f;
        }
    }

    public static void main(String[] args){
        System.out.println(e(4,4));
    }
}