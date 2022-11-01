package com.company;

abstract class Shape{
    void meth(){
        System.out.println("Properties of Shapes");
    }
    abstract double perimeter();
    abstract double area();
}
class Circle1 extends Shape{
    double radius;

    Circle1(double r){
        radius=r;
    }

    @Override
    double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(2,radius);
    }
}
class Rectangle1 extends Shape{
    double length;
    double breadth;

    Rectangle1(double l,double b) {
        length=l;
        breadth=b;
    }

    @Override
    double perimeter() {
        return 2*(length+breadth);
    }

    @Override
    double area() {
        return length*breadth;
    }
}

public class Abstract_Classes {
    public static void main(String[] args) {
        Shape s1=new Circle1(5);
        s1.meth();
        System.out.println("Perimeter: "+s1.perimeter());
        System.out.println("Area: "+s1.area());
        Shape s2=new Rectangle1(4,2);
        s2.meth();
        System.out.println("Perimeter: "+s2.perimeter());
        System.out.println("Area: "+s2.area());
    }
}
