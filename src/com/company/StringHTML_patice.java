package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHTML_patice {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int testCases = Integer.parseInt(in.nextLine());
         while(testCases>0) {
            Pattern patter = Pattern.compile("<(([^>]+)>([^<>]+)</\\\\1>)");
             Matcher matcher = patter.matcher(in.nextLine());
             System.out.println("Pattern answere "+patter+
                     "\n Mather answere :"+matcher);
             Boolean bollean = true;
             while (matcher.find()) {
                 System.out.println(matcher.group(2));
                 bollean = false;
             }
             if (bollean)
                 System.out.println("None");
             testCases--;

         }
    }
}
