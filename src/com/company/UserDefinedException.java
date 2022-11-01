package com.company;

class RectangleNegativeDimensionsException extends Exception{
    public String toString(){
        return "Dimensions of rectangle cannot be Negative";
    }
}

public class UserDefinedException {
    static int areaRectangle(int l,int b) throws Exception{
        if(l<0 || b<0){
            throw new RectangleNegativeDimensionsException();
        }
        return l*b;
    }
    static String userDefinedExceptionOtherWay(String n) throws Exception{
            if(n=="abc") {
                throw new Exception("String cannot be initialized as abc");
            }
        return "all ok";
    }

    public static void main(String[] args){
        try {
            System.out.println(areaRectangle(2, -4));
        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
            System.out.println(userDefinedExceptionOtherWay("abc"));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
