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
    int length(){
        Node p=head;
        int length=0;
        while(p!=null){
            length++;
            p=p.next;
        }
        return length;
    }
    void insert(int data, int pos){
        Node t,p;
        if(pos<0 || pos>length()){
            System.out.println("Invalid position, Length of CLL is " + length());
            return;
        }
        if(pos==0){
            t=new Node(data);
            if(head==null){
                head=t;
                return;
            }
            t.prev=null;
            t.next=head;
            head.prev=t;
            head=t;
        }
        else{
            p=head;
            t=new Node(data);
            for(int i=0;i<pos-1;i++){
                p=p.next;
            }
            t.next=p.next;
            t.prev=p;
            if(p.next!=null){
                p.next.prev=t;
            }
            p.next=t;
        }
    }
    void insertBeforeHead(int data){
        Node t = new Node(data);
        if(head==null){
            head=t;
            return;
        }
        t.prev=null;
        t.next=head;
        head.prev=t;
        head=t;
    }
    void arraytoDLL(int[] arr){
        for(int i= arr.length-1;i>=0;i--){
            insertBeforeHead(arr[i]);
        }
    }
    int delete(int pos){
        Node p;
        if(head==null || pos<0 || pos>length()){
            System.out.println("Bad Request, Size of cll is "+length());
            return -1;
        }
        if(pos==1){
            p=head;
            head=head.next;
            int x = p.data;
            p=null;
            if(head!=null) head.prev=null;
            return x;
        }
        else{
            p=head;
            for(int i=0;i<pos-1;i++){
                p=p.next;
            }
            p.prev.next=p.next;
            if(p.next!=null) p.next.prev=p.prev;
            int x = p.data;
            p=null;
            return x;
        }
    }
    void reverse(){
        Node p=head,temp;
        while(p!=null){
            temp=p.next;
            p.next=p.prev;
            p.prev=temp;
            p=p.prev;
            if(p!=null && p.next==null){
                head=p;
            }
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
        int[] a = {1,2,3,4,5};
        DoublyLinkedList dl1 = new DoublyLinkedList();
        dl1.arraytoDLL(a);
        dl1.insert(6,5);
        dl1.insert(7,6);
        dl1.Display();
        System.out.println(dl1.delete(1));
        System.out.println(dl1.delete(6));
        dl1.rDisplay(dl1.head);
        dl1.reverse();
        dl1.Display();
    }
}
