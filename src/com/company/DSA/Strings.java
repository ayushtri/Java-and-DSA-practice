package com.company.DSA;

class Strings
{
    static boolean valid(String str){
        char[] name=str.toCharArray();
        for(int i=0;i< name.length;i++){
            if(!(name[i]>=65 && name[i]<=90) && !(name[i]>=97 && name[i]<=122) && !(name[i]>=48 && name[i]<=57)){
                return false;
            }
        }
        return true;
    }
    static String reverse(String str){

        //M-1
        /*char[] A=str.toCharArray();
        char[] B=new char[str.length()];
        int j=0;
        for(int i=str.length()-1;i>=0;i--){
            B[j++]=A[i];
        }
        return new String(B);*/

        //M-2
        char[] A=str.toCharArray();
        int j=str.length()-1;
        char temp;
        for(int i=0;i<j;i++){
            temp=A[i];
            A[i]=A[j];
            A[j--]=temp;
        }
        return new String(A);
    }
    static void compare(String str1, String str2){
        char[] A=str1.toCharArray();
        char[] B=str2.toCharArray();
        int i,j;
        for(i=0,j=0;(i<str1.length() && j<str2.length());i++,j++) {
            if (A[i] != B[j]) break;
        }
        if (A[i] == B[j]) System.out.println("Equal");
        else if (A[i] < B[j]) System.out.println("Smaller");
        else System.out.println("Greater");
    }
    static boolean paindrome(String str){
        //M-1
        /*String rstr=reverse(str);
        char[] A=str.toCharArray();
        char[] B=rstr.toCharArray();
        int i,j;
        for(i=0,j=0;i<str.length();i++,j++){
            if(A[i]!=B[i]) return false;
        }
        return true;*/
        //M-2
        char[] A=str.toCharArray();
        int j=str.length()-1;
        for(int i=0;i<j;i++,j--){
            if(A[i]!=A[j]) return false;
        }
        return true;
    }
    static void anagram(String str1, String str2){
        char[] A=str1.toCharArray();
        char[] B=str2.toCharArray();
        int[] H=new int[26];
        int i;
        for(i=0;i<str1.length();i++){
            H[A[i]-97]++;
        }
        for(i=0;i<str2.length();i++){
            H[B[i]-97]--;
            if(H[B[i] - 97] != 0){
                System.out.println("Not Anagram");
                break;
            }
        }
        if(B[i-1]==B[str2.length()-1]) System.out.println("Anagram");
    }
    static void perm(char[] s, int l, int h){
        if(l==h){
            System.out.println(s);
        }
        else{
            for(int i=l;i<=h;i++){
                swap(s,l,i);
                perm(s,l+1,h);
                swap(s,l,i);
            }
        }
    }
    static void swap(char[] c,int x,int y){
        char temp=c[x];
        c[x]=c[y];
        c[y]=temp;
}

    public static void main (String[] args){
        String s="WELCOME";
        if(valid(s)) System.out.println("Valid String");
        else System.out.println("Invalid String");
        System.out.println(reverse(s));
        String s1="Hello",s2="Hallo";
        compare(s1,s2);
        String s3="liril";
        if(paindrome(s3)) System.out.println(s3+" is a palindrome.");
        else System.out.println(s3+" is not a palindrome");
        String ana1="decimal",ana2="medical";
        anagram(ana1,ana2);
        char[] c=new String("ABC").toCharArray();
        perm(c,0,2);
    }
}
