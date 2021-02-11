package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaStringToken {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        if(s.length()<=1 || s.length()>=400000|| s==null)
            System.out.println(0);

        else{
            String[] parts = s.trim().split("[ !,?._'@]+");
            System.out.println(parts.length);
            for(String string1:parts)
            {
                System.out.println(string1);
            }
        }
        scan.close();
        // New code work1
        /*0String IP = "000.12.12.034 ";
        System.out.println("Answere of IP address: "+IP.matches(new MyRegex().pattern));
        System.out.println("Answere is :"+Pattern.matches("^[01]?\\d\\d?$","201"));
    */}
    }
class MyRegex{
    // New code work1
      String ch="^([01]?\\d\\d?|2[0-4]\\d|2[0-5]\\d)$",x="^\\.$";
     public String pattern=ch+x+ch+x+ch+x+ch;
}


