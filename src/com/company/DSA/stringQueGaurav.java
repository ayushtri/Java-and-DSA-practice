package com.company.DSA;

public class stringQueGaurav { //Rajiv Roy 425968 5 -> YrAJIV62
    public static String ans(String fname, String lname, int pincode, int n) {
        String result = "";
        if (fname.length() == lname.length()) {
            if (lname.compareTo(fname) < 0) {
                result += lname.toUpperCase().charAt(lname.length() - 1) + String.valueOf(fname.toLowerCase().charAt(0));
                for (int i = 1; i < fname.length(); i++) {
                    result += fname.toUpperCase().charAt(i);
                }
            } else {
                result += fname.toUpperCase().charAt(fname.length() - 1) + String.valueOf(lname.toLowerCase().charAt(0));
                for (int i = 1; i < lname.length(); i++) {
                    result += lname.toUpperCase().charAt(i);
                }
            }
        } else if (fname.length() > lname.length()) {
            result += lname.toUpperCase().charAt(lname.length() - 1) + String.valueOf(fname.toLowerCase().charAt(0));
            for (int i = 1; i < fname.length(); i++) {
                result += fname.toUpperCase().charAt(i);
            }
        } else if (fname.length() < lname.length()) {
            result += fname.toUpperCase().charAt(fname.length() - 1) + String.valueOf(lname.toLowerCase().charAt(0));
            for (int i = 1; i < lname.length(); i++) {
                result += lname.toUpperCase().charAt(i);
            }
        }
        String pin = String.valueOf(pincode);
        result += String.valueOf(pin.charAt(n - 1)) + String.valueOf(pin.charAt(6-n));
        return result;
    }
    public static void main(String[] args) {
        String fname = "Kumud";
        String lname = "Kumar";
        int pincode = 561327;
        int n = 2;
        System.out.println(ans(fname, lname, pincode, n));
    }
}
