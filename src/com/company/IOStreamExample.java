package com.company;

import java.io.*;

public class IOStreamExample {
    public static void main(String[] args){
        System.out.println("Source File 1");
        try{
            try(FileInputStream fis1=new FileInputStream("iostreamexamplefile1.txt")){
                byte[] b=new byte[fis1.available()];
                fis1.read(b);
                String str=new String(b);
                System.out.println(str);
                fis1.close();
                FileOutputStream fos=new FileOutputStream("iostreamexamplefile2.txt");
                fos.write(str.toLowerCase().getBytes());
                fos.close();
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Source File 2");
        try{
            try(FileInputStream fis= new FileInputStream("iostreamexamplefile2.txt")){
                byte[] b=new byte[fis.available()];
                fis.read(b);
                String str=new String(b);
                System.out.println(str);
            }
        }
        catch (IOException e){
            System.out.println(e);
        }

        try{
            FileInputStream fis1=new FileInputStream("iostreamexamplefile1.txt");
            FileInputStream fis2=new FileInputStream("iostreamexamplefile2.txt");
            FileOutputStream fos1=new FileOutputStream("Destination.txt");
            SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
            int b1;
            while((b1=sis.read())!=-1){
                fos1.write(b1);
            }
            fis1.close();
            fis2.close();
            sis.close();
        }
        catch (IOException e){
            System.out.println(e);
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Destination");
        try{
            try(FileInputStream fis= new FileInputStream("Destination.txt")){
                int b;
                while((b= fis.read())!=-1){
                    System.out.print((char)b);
                }
            }
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}
