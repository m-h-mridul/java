package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyMethod {
    public static double doubleValue;
    public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    doubleValue=input.nextDouble();
    input.nextLong();
    System.out.println("US:"+work(Locale.US));
    System.out.println("India:"+work(new Locale("en", "IN")));
    System.out.println("China:"+work(Locale.CHINA));
    System.out.println("France:"+work(Locale.FRANCE));

   // NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"))

    /*  US: $12,324.13
        India: Rs.12,324.13
        China: ￥12,324.13
        France: 12 324,13 €
*/
  }

    private static String work(Locale locale) {
        NumberFormat inp = NumberFormat.getCurrencyInstance(locale);
        String vlaueof_currency=inp.format(doubleValue);
        return vlaueof_currency;
    }


}
