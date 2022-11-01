package com.company;

class MyData1{
    int value=0;
    boolean flag=true;
    synchronized void set(int v){
        while(flag==false){
            try{
                wait();
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
        value=v;
        flag=false;
        notify();
    }
    synchronized int get(){
        int x=0;
        while(flag==true){
            try{
                wait();
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
        x=value;
        flag=true;
        notify();
        return x;
    }
}

class Consumer extends Thread{
    MyData1 d;
    Consumer(MyData1 dat){
        d=dat;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Consumer: "+d.get());
        }
    }
}

class Producer extends Thread{
    MyData1 d;
    Producer(MyData1 dat){
        d=dat;
    }

    @Override
    public void run() {
        int i=1;
        while(true){
            d.set(i);
            System.out.println("Producer: "+i);
            i++;
        }
    }
}

public class InterThreadCommunicationDemo {
    public static void main(String[] args) {
        MyData1 d=new MyData1();
        Consumer c1=new Consumer(d);
        Producer p1=new Producer(d);
        c1.start();
        p1.start();
    }
}
