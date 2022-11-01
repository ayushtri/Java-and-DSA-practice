package com.company;

// Using Thread Class

//class MyThread extends Thread{
//    @Override
//    public void run(){
//        int i=1;
//        while(true){
//            System.out.println(i+" Hello");
//            i++;
//        }
//    }
//}

//Using Runnable interface

class MyThread implements Runnable{
    @Override
    public void run() {
        int i=1;
        while(true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args){
        MyThread mt=new MyThread();
        Thread t=new Thread(mt);
        //mt.start();
        t.start();
        int i=1;
        while(true){
            System.out.println(i+" World");
            i++;
        }
    }
}
