package com.company.DSA;

import java.util.ArrayList;
import java.util.Stack;

public class StackImpAL {
    static class Stack1{
         static ArrayList<Integer> list = new ArrayList<>();

         public static boolean isEmpty(){
             return list.size()==0;
         }

         public static void push(int data){
             list.add(data);
         }

         public static int pop(){
             if(isEmpty()) return -1;
             int top = list.get(list.size()-1);
             list.remove(list.size()-1);
             return top;
         }

         public static int peek(){
             if(isEmpty()) return -1;
             return list.get(list.size()-1);
         }
    }

    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        //Stack using Collections

        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }

    }
}
