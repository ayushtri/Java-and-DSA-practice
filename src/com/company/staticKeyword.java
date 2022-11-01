package com.company;

class Hondacity{
    static long price=10;
    int a,b;
    static double OnRoadPrice(String city){
        switch(city){
            case "Delhi": return price+price*0.1;
            case "Mumbai": return price+price*0.09;
            default:return price+price*0.12;
        }
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        Hondacity h1=new Hondacity();
        System.out.println(h1.OnRoadPrice("Delhi"));
    }
}
