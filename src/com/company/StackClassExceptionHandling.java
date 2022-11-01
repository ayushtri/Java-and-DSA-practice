package com.company;

class StackOverFlowException extends Exception{
    public String toString(){
        return "Stack is Full";
    }
}

class StackUnderFlowException extends Exception{
    public String toString(){
        return "Stack is Empty";
    }
}

class Stack{
    private int size;
    private int top=-1;
    private int[] S;

    public Stack(int size){
        this.size=size;
        S=new int[size];
    }

    public void push(int x) throws StackOverFlowException{
        if(top==size-1){
            throw new StackOverFlowException();
        }
        top++;
        S[top]=x;
    }

    public void pop() throws StackUnderFlowException{
        int x=-1;
        if(top==-1){
            throw new StackUnderFlowException();
        }
        x=S[top];
        top--;
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(S[i]);
        }
    }
}

public class StackClassExceptionHandling {
    public static void main(String[] args) {
        Stack s=new Stack(4);
        try{
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
        }
        catch (Exception e){
            System.out.println(e);
        }
        s.display();

        System.out.println("------------------------------------------------------------------");
        System.out.println("Pop");
        System.out.println("");
        try{
            s.pop();
            s.pop();
            s.pop();
        }
        catch (Exception e){
            System.out.println(e);
        }
        s.display();
    }
}
