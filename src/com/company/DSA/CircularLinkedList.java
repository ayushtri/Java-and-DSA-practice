package com.company.DSA;

public class CircularLinkedList {
    Node head;
    //Node tail;
     static class Node{
         int data;
         Node next;

         Node(int data){
             this.data=data;
             this.next=null;
         }
     }
     void insertBeforeHead(int data){               //insert at index-0
         Node t = new Node(data);
         if(head==null){
             head=t;
             head.next=head;
             return;
         }
         t.next = head;
         Node p = head;
         while(p.next!=head){
             p=p.next;
         }
         p.next=t;
         head = t;
     }
     /*void insertBeforeHead(int data){
         Node newNode = new Node(data);
         if(head==null){
             head = newNode;
             tail = newNode;
             newNode.next=head;
         }
         else{
             newNode.next=head;
             head=newNode;
             tail.next=head;
         }
     }*/
    void insertAtAny(int data,int pos){
        Node t;
        t= new Node(data);
        if(head==null){
            head=t;
            head.next=head;
            return;
        }
        Node p = head;
        for(int i=0;i<pos-1;i++){
            p=p.next;
        }
        t.next=p.next;
        p.next=t;
    }
     void arrayCircularLL(int[] A){
         for(int i=A.length-1;i>=0;i--){
             insertBeforeHead(A[i]);
         }
     }
     int length(){
        Node p = head;
        int length = 0;
        if(head==null) return 0;
        do{
            length++;
            p=p.next;
        }while(p!=head);
        return length;
     }
     void insert(int data, int pos){
        Node t,p;
        if(pos<0 || pos>length()) {
            System.out.println("Invalid position, Length of CLL is " + length());
            return;
        }
        if(pos==0){
            t=new Node(data);
            if(head==null){
                head=t;
                head.next=head;
                return;
            }
            p=head;
            while(p.next!=head){
                p=p.next;
            }
            p.next=t;
            t.next=head;
            head=t;
        }
        else{
            p=head;
            for(int i=0;i<pos-1;i++){
                p=p.next;
            }
            t=new Node(data);
            t.next=p.next;
            p.next=t;
        }
     }
     int delete(int pos){
        int x;
        Node p,q;
        if(head==null || pos<0 || pos>length()){
            System.out.println("Bad Request, Size of cll is "+length());
            return -1;
        }
        if(pos==1){
            p=head;
            while(p.next!=head){
                p=p.next;
            }
            x=head.data;
            if(p==head){
                head=null;
            }
            else{
                p.next=head.next;
                head=null;
                head=p.next;
            }
        }
        else{
            p=head;
            for(int i=0;i<pos-2;i++){
                p=p.next;
            }
            q=p.next;
            p.next=q.next;
            x=q.data;
            q=null;
        }
        return x;
     }
     void display(){
         if(head==null){
             System.out.println("List is empty");
             return;
         }
         Node p = head;
         do{
             System.out.print(p.data+"->");
             p=p.next;
         }
         while(p!=head);
         System.out.println("head("+head.data+")");
     }
     int flag=0;
     void rDisplay(Node p){
         if(head==null){
             System.out.println("List is empty");
             return;
         }
         if(p!=head || flag==0){
             flag=1;
             System.out.print(p.data+"->");
             rDisplay(p.next);
         }
         else{
             flag=0;
             System.out.println("head("+head.data+")");
         }
     }

    public static void main(String[] args) {
         int[] a = {1,2,3,4,5};
         CircularLinkedList cl1 = new CircularLinkedList();
        CircularLinkedList cl2 = new CircularLinkedList();
         cl1.arrayCircularLL(a);
         cl1.display();
         cl1.rDisplay(cl1.head);
         cl2.display();
         cl2.rDisplay(cl2.head);
         cl1.insertAtAny(6,5);
         cl1.display();
         cl2.insert(1,0);
         cl2.display();
         cl2.insert(3,1);
         cl2.display();
         cl1.insert(0,0);
         cl1.display();
         cl2.insert(5,2);
         cl2.insert(9,4);
         cl2.display();
         cl1.delete(1);
         cl1.delete(6);
         cl1.delete(10);
         cl1.display();
    }
}
