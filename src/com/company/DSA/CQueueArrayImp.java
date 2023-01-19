package com.company.DSA;

public class CQueueArrayImp {
    static class CQueue{
        static int[] arr;
        static int size;
        static int rear=-1;
        static int front=-1;
        CQueue(int size){
            arr = new int[size];
            this.size=size;
        }
        static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        static boolean isFull(){
            return (rear+1)%size==front;
        }
        static void add(int data){
            if(isFull()){
                System.out.println("Queue full");
                return;
            }
            //for first element
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }
        static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            int result = arr[front];
            //for single element
            if(rear==front) {
                rear = front = -1;
            }
            else{
                front = (front+1)%size;
            }
            return result;
        }
        static int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        CQueue q = new CQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.remove()); //60 20 30 40 50
        q.add(60);
        System.out.println(q.remove());
        System.out.println("-----------------");
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
