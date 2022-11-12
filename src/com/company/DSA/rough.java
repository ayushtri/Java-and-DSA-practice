package com.company.DSA;

import java.util.Arrays;
import java.util.Scanner;

class Solution{
    public String prefix(String[] str){
        if(str.length==0) return "";
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        int c = 0;
        while(c<first.length() && first.charAt(c)==last.charAt(c))
            c++;
        return c==0 ? "" :first.substring(0,c);
    }
}
public class rough {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        String[] str = {"911","91178","9117623","9112"};
        System.out.println(s.prefix(str));
    }
}