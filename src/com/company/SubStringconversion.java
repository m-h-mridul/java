package com.company;

import java.util.Scanner;

public class SubStringconversion {
    static boolean isAnagram(String a, String b) {
       a= a.toLowerCase();
       b=b.toLowerCase();
      if(a.length()!= b.length())
          return false;
       for(int i=0;i<a.length();i++)
      {
        char a1=a.charAt(i);
          int r=0,r2=0;
        for(int j=0;j<b.length();j++)
        {
            if(a1==a.charAt(j))
                r++;
            if(a1==b.charAt(j))
                r2++;
        }
        if(r!=r2)
            return false;
      }
       return true;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
