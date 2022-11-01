package com.company;

import java.util.*;

public class rough{
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void display()
    {
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data +"-->");
            current=current.next;
        }
        System.out.print("null");
    }
    public int length(){
        if(head==null){
            return 0;
        }
        ListNode current = head;
        int count=0;
        while(current!=null){
            current=current.next;
            count++;
        }
        return count;
    }
    public void insert_at_start(int data)
    {
        ListNode newNode=new ListNode(data);
        newNode.next=head;
        head=newNode;
    }
    public void insert_at_end(int data)
    {
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void insert(int position,int data){
        ListNode newNode=new ListNode(data);
        if(position==1){
            newNode.next=head;
            head=newNode;
        }
        else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            newNode.next=current;
            previous.next=newNode;
        }
    }
    public boolean search(int searchKey){
        ListNode current=head;
        if(head==null){
            return false;
        }
        while(current!=null){
            if(current.data==searchKey){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public int searchPos(int searchKey){
        int count=1;
        ListNode current=head;
        if(head==null){
            return 0;
        }
        while(current!=null){
            if(current.data==searchKey){
                return count;
            }
            count++;
            current=current.next;
        }
        return 0;
    }
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        ListNode nextNode=null;
        while(current!=null){
            nextNode=current.next;
            current.next=previous;
            previous=current;
            current=nextNode;
        }
        return previous;
    }

    public static void main(String[] args) {
        rough r=new rough();
        r.head= new ListNode(11);
        ListNode second=new ListNode(15);
        ListNode third=new ListNode(17);
        ListNode fourth=new ListNode(19);

        //Connecting the nodes
        r.head.next=second;
        second.next=third;
        third.next=fourth;

        r.insert_at_start(5);
        r.insert_at_end(25);
        r.insert(5,18);

        r.display();

        System.out.println("");
        System.out.println("Length of the Given Singly Linked List is "+r.length());

        if(r.search(5)){
            System.out.println("Search Key Found at "+r.searchPos(5)+" position");
        }
        else{
            System.out.println("Search Key Not Found");
        }
//        head=r.reverse(head); //we have to make head accessable for this by making head static at start
//        r.display();
    }
}

