package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.WeakHashMap;

public class ArratLIstTwoDiminstion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberofwork = scan.nextInt();
        ArrayList[] arrayList = new ArrayList[numberofwork];
        for (int i = 0; i < numberofwork; i++) {
            arrayList[i] = new ArrayList();
            arrayList[i].add(scan.nextInt());

            for (int j = 1; j <= (int) arrayList[i].get(0); j++) {
                // System.out.println("Herer is "+arrayList[i].get(0));
                arrayList[i].add(scan.nextInt());
            }
        }
        //System.out.println("quire start ");
        int number = scan.nextInt();
        while (number-- > 0) {
            int ipostion = scan.nextInt();
            int xpostion = scan.nextInt();
            try {
                System.out.println(arrayList[ipostion - 1].get(xpostion));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}