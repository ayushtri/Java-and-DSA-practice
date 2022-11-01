package com.company.DSA;

public class DoublyLinkedList {
    Node head;
    static class Node{
        Node prev;
        int data;
        Node next;

        Node(int data){
            this.prev=null;
            this.data=data;
            this.next=null;
        }
    }
    void Display(){
        Node p = head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(p!=null){
            System.out.print(p.data+"<->");
            p=p.next;
        }
        System.out.println("Null");
    }
    void rDisplay(Node p){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(p!=null){
            System.out.print(p.data+"<->");
            rDisplay(p.next);
        }
        else{
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dl1 = new DoublyLinkedList();
        Node test = new Node(5);
        Node test2 = new Node(10);
        dl1.head=test;
        dl1.head.next=test2;
        dl1.Display();
        dl1.rDisplay(dl1.head);
    }
}
