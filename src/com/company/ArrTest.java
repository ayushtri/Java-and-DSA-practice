package com.company;

public class ArrTest {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        int[] B=new int[A.length*2];
        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }
        A=B;
        B=null;
        for (int j : A) {
            System.out.print(j + " ");
        }
        System.out.println("\n"+A.length);
    }
}
