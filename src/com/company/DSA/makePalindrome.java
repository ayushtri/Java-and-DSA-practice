package com.company.DSA;

public class makePalindrome {        //12332
    public static int remove(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else if(str.charAt(i+1)==str.charAt(j)){
                return Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            else if(str.charAt(i)==str.charAt(j-1)){
                return Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num = 12332;
        String str = String.valueOf(num);
        System.out.println(remove(str));
    }
}
