package com.company;

public class FinallyBlockExceptionHandling {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Final Message");
        }
    }
}
