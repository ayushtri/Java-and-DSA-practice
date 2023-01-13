package com.company.DSA;

public class QueueArrayImp {
    static class queueArr{
        static int[] arr;
        static int size;
        static int rear=-1;
        queueArr(int size){
            arr=new int[size];
            this.size=size;
        }
        static boolean isEmpty(){
            return rear==-1;
        }
        static boolean isFull(){
            return  rear==arr.length-1;
        }
        static void add(int data){
            if(isFull()){
                System.out.println("Queue Full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        queueArr q = new queueArr(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.isFull());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println(q.isEmpty());
    }
}
