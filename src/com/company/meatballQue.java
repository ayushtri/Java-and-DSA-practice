package com.company;

import java.util.Scanner;

public class meatballQue {
//    static void op(int[] arr){
//        int p = arr[0];
//        for(int i =0 ;i< arr.length-1;i++){
//            arr[i]=arr[i+1];
//        }
//        arr[arr.length-1]= p-2;
//    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        int N = sc.nextInt();
//        int D = sc.nextInt();
//        int[] Array = new int[N];
//        for(int i=0;i<N;i++){
//            Array[i]= sc.nextInt();
//        }
//        for(int i = Array.length-1;i>0;i++){
//            if(Array[i]==0)
//        }
        int n=sc.nextInt();
        int v[]= new int[n];
        int x=sc.nextInt();

        for(int i=0; i<n; i++)
            v[i]=sc.nextInt();

        for(int i=0;i<n;i++){
            v[i]=(v[i]-1)/x;

        }

        int m=0, maxPos=0;

        for(int i=0;i<n;i++){

            if(v[i]>=m){
                m=v[i];
                maxPos=i;
            }
        }

        System.out.println(maxPos+1);
    }
}
