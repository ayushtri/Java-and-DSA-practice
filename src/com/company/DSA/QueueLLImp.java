package com.company.DSA;

public class QueueLLImp {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class LQueue {
        static Node head = null;
        static Node tail = null;
        static boolean isEmpty(){
            return head == null && tail == null;
        }
        static void add(int data){
            Node newNode = new Node(data);
            if(tail==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            int front = head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return front;
        }
        static int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        LQueue q = new LQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
