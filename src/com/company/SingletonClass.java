package com.company;

class Coffeemachine{
    private float coffeeQTY;
    private float waterQTY;

    static Coffeemachine our=null;

    private Coffeemachine()
    {
        coffeeQTY=1;
        waterQTY=1;
    }

    static Coffeemachine getInstance(){
        if(our==null)
            our=new Coffeemachine();
            return  our;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
//        Coffeemachine c=new Coffeemachine();
        Coffeemachine c1=Coffeemachine.getInstance();
    }
}
