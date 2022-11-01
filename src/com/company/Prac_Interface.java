package com.company;

interface Member{
    void callback();
}
class Store{
    Member mem[]=new Member[10];
    int count=0;
     void register(Member m){
         mem[count++]=m;
     }
     void inviteSale(){
         for(int i=0;i<count;i++){
             mem[i].callback();
         }
     }
}
class Customer implements Member{
    String name;
    Customer(String n){
        name=n;
    }

    @Override
    public void callback() {
        System.out.println("Ok,I will visit "+name);
    }
}

public class Prac_Interface {
    public static void main(String[] args) {
        Store s=new Store();
        Customer c1=new Customer("Rahul");
        Customer c2=new Customer("Ram");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}
