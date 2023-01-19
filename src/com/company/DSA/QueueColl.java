package com.company.DSA;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class QueueColl {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
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
