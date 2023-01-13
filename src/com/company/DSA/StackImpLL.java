package com.company.DSA;

public class StackImpLL {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head;

        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public static int pop() throws Exception {
            if(isEmpty()){
                throw new Exception("Stack is Empty :D");
            }
            int top = head.data;
            head=head.next;
            return top;
        }

        public static int peek() throws Exception {
            if(isEmpty()){
                throw new Exception("Stack is Empty :D");
            }
            return head.data;
        }
    }

    public static void main(String[] args) throws Exception {
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        System.out.println(Stack.peek());
        System.out.println();
        while(!Stack.isEmpty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
