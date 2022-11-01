package com.company.DSA;

public class LinkedList{

    Node head;
    Node last;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void insertFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void insert(int data,int pos){
        Node p,t;
        if(pos==0){
            t=new Node(data);
            t.next=head;
            head=t;
        }
        else if(pos>0){
            p=head;
            for(int i=0;i<pos-1;i++){
                p=p.next;
            }
            t=new Node(data);
            t.next=p.next;
            p.next=t;
        }
    }
    void insertLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }
    void updateLast(){
        Node p=head;
        while(p.next!=null){
            p=p.next;
        }
        last=p;
    }
    void insertLast2(int data){
        Node t=new Node(data);
        if(head==null){
            head=last=t;
        }
        else{
            last.next=t;
            last=t;
        }
    }
    void arrayLinkedList(int[] A){
        for(int i=A.length-1;i>=0;i--){
            insertFirst(A[i]);
        }
    }
    int count(){
        int c=0;
        Node p=head;
        while(p!=null){
            c++;
            p=p.next;
        }
        return c;
    }
    int rCount(Node p){
        if(p==null) return 0;
        return rCount(p.next)+1;
    }
    int sum(){
        int s=0;
        Node p=head;
        while(p!=null){
            s+=p.data;
            p=p.next;
        }
        return s;
    }
    int rSum(Node p){
        if(p==null) return 0;
        return rSum(p.next)+p.data;
    }
    int max(){
        Node p=head;
        int max= Integer.MIN_VALUE;
        while(p!=null){
            if(p.data>max) max=p.data;
            p=p.next;
        }
        return max;
    }
    int rMax(Node p){
        int x;
        if(p==null) return Integer.MIN_VALUE;
        else{
            x=rMax(p.next);
            if(x>p.data) return x;
            return p.data;
        }
    }
    Node search(int target){
        Node p=head;
        while(p!=null){
            if(target==p.data) return p;
            p=p.next;
        }
        return null;
    }
    Node iSearch(int target){
        Node p=head;
        Node q=null;
        while(p!=null){
            if(target==p.data){
                q.next=p.next;
                p.next=head;
                head=p;
            }
            q=p;
            p=p.next;
        }
        return head;
    }
    void sortedInsert(int data){
        Node p=head;
        Node q=null;
        while(p!=null && p.data<data){
            q=p;
            p=p.next;
        }
        Node t=new Node(data);
        t.data=data;
        t.next=q.next;
        q.next=t;
    }
    void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node p=head;
        while(p!=null){
            System.out.print(p.data+"->");
            p=p.next;
        }
        System.out.println("Null");
    }
    void rDisplay(Node p){
        if(p!=null){
            System.out.print(p.data+"->");
            rDisplay(p.next);
        }
        else {
            System.out.println("Null");
        }
    }

    int deleteNode(int pos){
        Node p,t=null;
        int x;
        if(head==null){
            throw new IllegalArgumentException("List is empty");
        }
        else{
            if(pos==0){
                p=head;
                head=head.next;
                x = p.data;
                p=null;
                return x;
            }
            else{
                p=head;
                for(int i=0;i<pos;i++){
                    t=p;
                    p=p.next;
                }
                t.next=p.next;
                x=p.data;
                p=null;
                return x;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        LinkedList l1=new LinkedList();
        l1.insertLast(6);
        l1.arrayLinkedList(arr);
        l1.display();
        l1.rDisplay(l1.head);
        System.out.println(l1.count());
        System.out.println(l1.rCount(l1.head));
        System.out.println(l1.sum());
        System.out.println(l1.rSum(l1.head));
        System.out.println(l1.max());
        System.out.println(l1.rMax(l1.head));
        Node temp=l1.search(1);
        System.out.println(temp.data);
        Node temp1=l1.iSearch(5);
        System.out.println(temp1.data);
        l1.display();
        l1.insertFirst(7);
        l1.display();
        l1.insert(8,1);
        l1.display();
        l1.updateLast();
        l1.insertLast2(11);
        l1.display();
        LinkedList l2=new LinkedList();
        int[] arr1={1,2,3,5,6};
        l2.arrayLinkedList(arr1);
        l2.display();
        l2.sortedInsert(4);
        l2.display();
        System.out.println(l2.deleteNode(0));
        l2.display();
        System.out.println(l2.deleteNode(2));
        l2.display();
    }
}