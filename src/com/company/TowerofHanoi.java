package com.company;

class Solution2{
    void TOH(int n, char A, char B, char C){
        if(n>0) {
            TOH(n - 1, A, C, B);
            System.out.println("Move disk from " + A + " to " + C + " using " + B);
            TOH(n - 1, B, A, C);
        }
    }
}

public class TowerofHanoi {
    public static void main(String[] args) {
        Solution2 s=new Solution2();
        s.TOH(3,'A','B','C');
    }
}
