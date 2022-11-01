package com.company;

public class try_catch_Nested {
    public static void main(String[] args) {
        int[] A={10,20,30,40,0};
        try{
            int c=A[1]/A[4];
            System.out.println("c: "+c);
            System.out.println(A[10]);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Bye");
        //Other Way
//        try{
//            int[] A={10,20,30,40,0};
//            try{
//                int c=A[1]/A[0];
//                System.out.println("c: "+c);
//            }
//            catch (ArithmeticException e){
//                System.out.println(e);
//            }
//            System.out.println(A[10]);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
    }
}
