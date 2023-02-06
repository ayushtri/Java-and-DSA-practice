package com.company.DSA;

import java.util.Scanner;

public class gauravQues2 {
    public static int min3(int a, int b, int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else return c;
    }
    public static int max(int a, int b, int c,int d, int e, int f,int g, int h, int i){
        int[] temp = {a,b,c,d,e,f,g,h,i};
        int maxVal = Integer.MIN_VALUE;
        for(int z = 0;z<temp.length;z++){
            if(maxVal<temp[z]){
                maxVal=temp[z];
            }
        }
        return maxVal;
    }
    public static int ans(int n1, int n2, int n3){
        int u1 = n1%10;
        int u2 = n2%10;
        int u3 = n3%10;
        int t1 = (n1/10)%10;
        int t2 = (n2/10)%10;
        int t3 = (n3/10)%10;
        int h1 = (n1/100)%10;
        int h2 = (n1/100)%10;
        int h3 = (n1/100)%10;
        String result = "";
        String unit = String.valueOf(min3(u1,u2,u3));
        String tens = String.valueOf(min3(t1,t2,t3));
        String hundreds = String.valueOf(min3(h1,h2,h3));
        String thosands = String.valueOf(max(u1,u2,u3,t1,t2,t3,h1,h2,h3));
        result += thosands+hundreds+tens+unit;
        return Integer.parseInt(result);

    }
    public static boolean vlen(int n){
        return n >= 100 && n <= 999;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(vlen(n1) && vlen(n2) && vlen(n3)) System.out.print(ans(n1,n2,n3));
        else{
            System.out.println("Invalid Number");
        }
    }
}
