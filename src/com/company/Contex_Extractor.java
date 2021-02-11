package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Student10{
    Student10(){System.out.println("Student");}}
class Rockstar{}
class Hacker{}
public class Contex_Extractor {
    static String count(ArrayList mylist){
        int a = 0,b = 0,c = 0;
        for(int i = 0; i < mylist.size(); i++){
            Object element=mylist.get(i);
            System.out.println("Object "+element.getClass().getName().equals("com.company.Student10"));
            System.out.println("Object "+element.getClass().getName());
           // if(element.equals(Student()))
                a++;
           // if(~~Complete this line~~)
            b++;
           // if(~~Complete this line~~)
            c++;
        }
        //String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return "caat";
    }
    public static void main(String [] args){
        ArrayList mylist = new ArrayList();
       // int a[]=new int[]();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("Student"))mylist.add(new Student10());
            if(s.equals("Rockstar"))mylist.add(new Rockstar());
            if(s.equals("Hacker"))mylist.add(new Hacker());
        }
        count(mylist);
        //System.out.println(count(mylist));
    }

}
