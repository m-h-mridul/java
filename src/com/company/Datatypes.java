package com.company;

import java.util.Scanner;

public class Datatypes {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number=input.nextInt();
            for (int n = 0; n < number; n++) {
                try {
                    long secondNumber=input.nextLong();
                    System.out.println(secondNumber+" can be fitted in:");
                     if(secondNumber>=Byte.MIN_VALUE && secondNumber<=Byte.MAX_VALUE)
                        System.out.println("* byte");
                     if(secondNumber>=Short.MIN_VALUE && secondNumber<=Short.MAX_VALUE);
                       System.out.println("* short");
                     if(secondNumber>=Integer.MIN_VALUE && secondNumber<=Integer.MAX_VALUE)
                        System.out.println("* int");
                     if(secondNumber>=Long.MIN_VALUE && secondNumber<=Long.MAX_VALUE)
                          System.out.println("* long");
                }
                catch (Exception e) {
                    System.out.println("exception " + e);
                }
            }
        }
    }
