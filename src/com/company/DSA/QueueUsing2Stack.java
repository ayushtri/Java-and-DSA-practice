package com.company.DSA;

import java.util.Stack;

public class QueueUsing2Stack {
    static class Queue2{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        static int remove(){
            if(s1.isEmpty()) return -1;
            return s1.pop();
        }
        static int peek(){
            if(s1.isEmpty()) return -1;
            return s1.peek();
        }
        static boolean isEmpty(){
            return s1.isEmpty();
        }

    }
    static class Queue3{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        static boolean isEmpty(){
            return s1.isEmpty();
        }
        static void add(int data){
            s1.push(data);
        }
        static int remove(){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int front = s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return front;
        }
        static int peek(){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int front = s2.peek();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return front;
        }
    }
    public static void main(String[] args) {
        Queue2 q = new Queue2();
        Queue3 q1 = new Queue3();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println("-----------");
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }

    }
}
