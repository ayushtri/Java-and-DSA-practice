package com.company.DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class recQue {
    static void reverse(String str, int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(str,idx-1);
    }
    static int first = -1;
    static int last = -1;
    static void firstLastOCC(String str, int idx, char element){
        if(idx==str.length()){
            System.out.println("\n"+first+" "+last);
            return;
        }
        if(str.charAt(idx)==element){
            if(first==-1){
                first=idx;
            }
            else {
                last=idx;
            }
        }
        firstLastOCC(str,idx+1,element);
    }
    static boolean arrSortCheckInc(int[] arr, int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            return false;
        }
        else {
            return arrSortCheckInc(arr,idx+1);
        }
    }
    static String newString = "";
    static String endString = "";
    static void moveAllxEnd(String str,int idx){
        if(idx==str.length()){
            newString+=endString;
            System.out.println(newString);
            return;
        }
        if(str.charAt(idx)!='x'){
            newString+=str.charAt(idx);
        }
        else{
            endString+="x";
        }
        moveAllxEnd(str,idx+1);
    }
    static boolean[] map = new boolean[26];
    static void removeDuplicates(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']){
            removeDuplicates(str,idx+1, newString);
        } else {
            newString += currChar;
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1, newString);
        }
    }
    static void subsequences(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subsequences(str,idx+1,newString+currChar);
        subsequences(str, idx+1, newString);
    }
    static void subsequencesUnique(String str, int idx, String newString, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        subsequencesUnique(str,idx+1,newString+currChar,set);
        subsequencesUnique(str, idx+1, newString,set);
    }
    static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
            "tu", "vwx", "yz"};
    static void keypadComb(String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for(int i = 0;i<mapping.length();i++){
            keypadComb(str,idx+1,combination+mapping.charAt(i));
        }
    }
    static void permutationStr(String str,List<String> perm,String p){
        if(str.length()==0){
            perm.add(p);
            return;
        }
       for(int i=0;i<str.length();i++){
           char currChar = str.charAt(i);
           String temp = str.substring(0,i)+str.substring(i+1);
           permutationStr(temp,perm,p+currChar);
       }
    }
    static int precedence(char op){
        if(op=='^') return 3;
        else if(op=='/' || op=='*') return 2;
        else if(op=='+' || op=='-') return 1;
        else return 0;
    }
    static String infixPostfix(String str){
        Stack<Character> s = new Stack<>();
        String post="";
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            if(currChar=='('){
                s.push(currChar);
            }
            else if(precedence(currChar)==0 && currChar!=')'){
                post+=currChar;
            }
            else if(currChar==')'){
                while(!s.isEmpty() && s.peek()!='('){
                    post+=s.pop();
                }
                s.pop();
            }
            else{
                while(!s.isEmpty() && precedence(currChar)<=precedence(s.peek())){
                    post+=s.pop();
                }
                s.push(currChar);
            }
        }
        while(!s.isEmpty()){
            post+=s.pop();
        }
        return post;
    }
    static String strRev(String str){
        String rStr ="";
        for(int i=str.length()-1;i>=0;i--){
            rStr+=str.charAt(i);
        }
        return rStr;
    }
    static String infixPrefix1(String str){
        Stack<Character> s = new Stack<>();
        String post="";
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            if(currChar==')'){
                s.push(currChar);
            }
            else if(precedence(currChar)==0 && currChar!='('){
                post+=currChar;
            }
            else if(currChar=='('){
                while(!s.isEmpty() && s.peek()!=')'){
                    post+=s.pop();
                }
                s.pop();
            }
            else{
                while(!s.isEmpty() && precedence(currChar)<=precedence(s.peek())){
                    post+=s.pop();
                }
                s.push(currChar);
            }
        }
        while(!s.isEmpty()){
            post+=s.pop();
        }
        return post;
    }
    static String infixPrefix2(String str){
        String rStr =strRev(str);
        String pre = infixPrefix1(rStr);
        return strRev(pre);
    }
    static boolean isPalindrome(String str){
        if(str.length()==0 || str.length()==1){
            return true;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)){
           return isPalindrome(str.substring(1,str.length()-1));
        }
        return false;
    }
    static int countPathsMaze(int i,int j,int m, int n){
        if(i==m || j==n) return 0;
        if(i==m-1 && j==n-1) return 1;
        int downwards = countPathsMaze(i,j+1,m,n);
        int right = countPathsMaze(i+1,j,m,n);
        return downwards + right;
    }
    static int placeTilesProb(int n,int m){
        if(n==m) return 2;
        if(n<m) return 1;
        int vertical = placeTilesProb(n-m,m);
        int horizontal = placeTilesProb(n-1,m);
        return vertical+horizontal;
    }
    static int waysToInvite(int n){
        if(n<=1){
            return 1;
        }
        int singleGuest = waysToInvite(n-1);
        int pairGuest = (n-1)*waysToInvite(n-2);
        return singleGuest+pairGuest;
    }
    public static void main(String[] args) {
        reverse("abcd","abcd".length()-1);
        firstLastOCC("abbbbccccad",0,'a');
        System.out.println(arrSortCheckInc(new int[]{1, 2, 3, 4, 5},0));
        moveAllxEnd("axxyush",0);
        removeDuplicates("aayyuush",0,"");
        subsequences("abc",0,"");
        HashSet<String> set = new HashSet<>();
        subsequencesUnique("aaa",0,"",set);
        keypadComb("12",0,"");
        List<String> test = new ArrayList<>();
        permutationStr("abc",test,"");
        System.out.println(test);
        String expression = "A+B/C*(D+E)-F";
        System.out.println(infixPostfix(expression));
        System.out.println(infixPrefix2(expression));
        String test1 = "abcba";
        System.out.println(isPalindrome(test1));
        System.out.println(countPathsMaze(0,0,3,3));
        System.out.println(placeTilesProb(4,2));
        System.out.println(waysToInvite(4));
    }
}
