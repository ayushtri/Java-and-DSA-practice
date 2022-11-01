package com.company.DSA;

import java.sql.SQLOutput;
import java.util.Locale;

public class rough{
    public static void main(String[] args) {
        //q2
        /*String input = "Praveen Kumar Sharma";
        String[] temp = input.split(" ");
        String output="";
        int evenstart=0,oddstart=0;
        for(int i=0;i<temp.length;i++){
            if(i%2==0){
                for(int j=evenstart;j<temp[i].length();j++){
                    if(j%2==0){
                        output+=temp[i].charAt(j);
                    }
                }
                evenstart++;
            }
            else{
                for(int j=oddstart;j<temp[i].length();j++){
                    if(!(j%2==0)){
                        output+=temp[i].charAt(j);
                    }
                }
                oddstart++;
            }
        }
        System.out.println(output);*/

        //q3
        /*String input="Ananya Anuragi";
        String output="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                output=output+" ";
                continue;
            }
            output=output+((int)input.charAt(i));
            
        }
        System.out.println(output);*/

        //q4
        /*String input= "Ananya Anuragi";
        input=input.toLowerCase();
        String output="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                output=output+" ";
                continue;
            }
            output=output+(input.charAt(i)-96); //typecasting ki zarurat nhi hai
        }
        System.out.println(output);*/

        //q5
    }
}