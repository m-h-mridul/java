package com.company;

import java.util.Scanner;

public class Static_method {
    static int B,H;
    static Boolean flag=false;
    static{
        Scanner input=new Scanner(System.in);
        B=input.nextInt();
        H=input.nextInt();
        if(B>0 && H>0)
            flag=true;
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
