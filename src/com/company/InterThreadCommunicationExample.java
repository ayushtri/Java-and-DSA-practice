package com.company;

import java.util.Objects;

class Whiteboard{
    String text;
    int n=0;
    int count=0;
    synchronized void write(String msg){
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Teacher is writing "+msg);
        while(count!=0){
            try{
                wait();
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
        text=msg;
        count=n;
        notify();
    }
    synchronized  String read(){
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        String s;
        while(count==0){
            try{
                wait();
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
            s=text;
            count--;
            if(count==0){
                notify();
            }
            return s;
    }

    void attendance(){
        n++;
    }
}

class Teacher extends Thread{
    Whiteboard w;
    Teacher(Whiteboard wb){
        w=wb;
    }
    String[] notes={"Java is Language","It is OOPs","It is platform Independent","It supports Multithreading","end"};

    @Override
    public void run() {
        for(int i=0;i<notes.length;i++){
            w.write(notes[i]);
        }
    }
}

class Student extends Thread{
    String name;
    Whiteboard w;
    Student(Whiteboard wb,String n){
        w=wb;
        name=n;
    }

    @Override
    public void run() {
        w.attendance();
        String s;
        do{
            s=w.read();
            System.out.println(name+" is reading "+s);
            System.out.flush();
        }
        while (!s.equals("end"));
    }
}

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        Whiteboard w=new Whiteboard();
        Teacher t=new Teacher(w);
        Student s1=new Student(w,"1. Aman");
        Student s2=new Student(w,"2. Amit");
        Student s3=new Student(w,"3. John");
        Student s4=new Student(w,"4. Smith");
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
