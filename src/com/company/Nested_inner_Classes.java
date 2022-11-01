package com.company;

class Outer{
    int x=10;
    class Inner{
        int y=20;
        void inner_display(){
            System.out.println(x+","+y);
        }
    }
    void outer_display(){
        Inner i =new Inner();
        i.inner_display();
    }
}

public class Nested_inner_Classes {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.outer_display();
        Outer.Inner oi=new Outer().new Inner();
        oi.inner_display();
    }
}
