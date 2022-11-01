package com.company;

import java.util.*;
import java.text.*;

public class LocaleStringCurrency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        if(payment>=0 && payment<=Math.pow(10, 9)){
            NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
            Locale India=new Locale("en","IN");
            NumberFormat india=NumberFormat.getCurrencyInstance(India);
            NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);

            // Write your code here.

            System.out.println("US: " + us.format(payment));
            System.out.println("India: " + india.format(payment));
            System.out.println("China: " + china.format(payment));
            System.out.println("France: " + france.format(payment));
        }
    }
}