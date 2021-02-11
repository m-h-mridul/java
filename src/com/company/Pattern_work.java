package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_work {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);  //_Julia007
        Matcher ans=Pattern.compile("^[A-Za-z]\\w{7,29}$").matcher("Samantha_21");
        System.out.println("Answere :"+ ans.find());
        //String string1=input.next("(a-z)");
        //System.out.println("Answere :"+ string1);
        /*
        Julia Samantha Samantha_21 1Samantha Samantha?10_2A JuliaZ007 Julia@007 _Julia007
         */
    }
}
