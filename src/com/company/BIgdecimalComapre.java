package com.company;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BIgdecimalComapre {
    public static void main(String []ar){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if(s==null || t1==null)
                    return 0;
                BigDecimal a=new BigDecimal(s);
                BigDecimal b=new BigDecimal(t1);
                return b.compareTo(a);

            }
        });

        //Write your code here

        //Output
        System.out.println("              ans");
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
