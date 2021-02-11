package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Subarray {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>(4000);
        int number=input.nextInt();
        for(int i=0;i<number;i++)
            list.add(input.nextInt());
        int qua=input.nextInt();
        while(qua>0){
            String ch=input.next();
            if(ch.equals("Insert"))
                list.add(input.nextInt(),input.nextInt());
            else if( ch.equals("Delete"))
                list.remove(input.nextInt());
            qua--;
        }
        for (int i = 0; i <list.size() ; i++)
            System.out.print(list.get(i) + " ");
    }


}
