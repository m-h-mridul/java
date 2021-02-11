package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Java_Map_use_String {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //in.nextLine();
        HashMap <String,Integer> hashMap=new HashMap<String,Integer>();
        for (int i = 0; i < n; i++) {
             String name= in.nextLine();
             int phone = in.nextInt();
             hashMap.put(name,phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            try{
            int temp=hashMap.get(s);
            System.out.println(s+"="+temp);
        }
            catch (Exception e){
                System.out.println("Not found");
        }}
    }
}