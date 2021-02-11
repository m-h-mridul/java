package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pattern_Cheak {
    public static void main(String[] args)throws Exception{
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(Exception e){
                System.out.println("Invalid");
            }
        }
    }
}
