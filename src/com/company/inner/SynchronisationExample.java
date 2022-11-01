package com.company.inner;

class ATM{
    synchronized void checkBalance(String name){
        System.out.println(name+" checking Balance");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Balance");
    }
    synchronized void withdraw(String name, int amt){
        System.out.println(name+","+amt+" withdrawing");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("$"+amt);
    }
}

class Customer extends Thread{
    String name;
    int amount;
    ATM atm;
    Customer(String n,int a,ATM at){
        atm=at;
        name=n;
        amount=a;
    }

    void useATM(){
        atm.checkBalance(name);
        atm.withdraw(name,amount);
    }

    @Override
    public void run() {
        useATM();
    }
}

public class SynchronisationExample {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Customer c1=new Customer("John",1000, atm);
        Customer c2=new Customer("Aman",5000, atm);
        c1.start();
        c2.start();
    }
}
