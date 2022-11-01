package com.company;

class Circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
class Cylinder extends Circle{
    public double height;
    public double volume(){
        return area()*height;
    }
}
class Super{
    Super(){
        System.out.println("Non-Param of Super");
    }
    Super(int x){
        System.out.println("Param of Super"+x);
    }
    public void meth1()
    {
        System.out.println("Super Meth 1");
    }
    public void meth2()
    {
        System.out.println("Super Meth 2");
    }
}
class Sub extends Super{
    Sub(){
        System.out.println("Non-Param of Sub");
    }
    Sub(int y){
        System.out.println("Param of Sub"+y);
    }
    Sub(int x,int y){
        super(x);
        System.out.println("Param of Sub"+y);
    }
    public void meth2()
    {
        System.out.println("Sub Meth 2");
    }
    public void meth3(){
        System.out.println("Sub Meth 3");
    }
}

public class Prac_Inheritace {
    public static void main(String[] args){
        Circle c1=new Circle();
        c1.radius=7;
        System.out.println("Area of Circle: "+c1.area());
        System.out.println("Circumference of Circle: "+c1.circumference());
        Cylinder cy1=new Cylinder();
        cy1.height=10;
        cy1.radius=7;
        System.out.println("Area of Cylinder: "+cy1.area());
        System.out.println("Volume of Cylinder: "+cy1.volume());


        Sub s1=new Sub();
        s1.meth1();
        s1.meth2();
        Sub s2=new Sub(2);
        Sub s3=new Sub(2,3);

        //Dynamic Method Dispatch
        Super s4=new Sub();
        s4.meth1();
        s4.meth2(); //meth2 of sub will be called becoause object is of sub
//        s4.meth3(); cannot be called because super doesnt have meth3
    }
}
