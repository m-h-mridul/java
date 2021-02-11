package com.company;

import java.util.Scanner;

public class ArryhourGlass {
  public static void main(String []args) {
      Scanner input = new Scanner(System.in);
      int n=6,max=Integer.MIN_VALUE,s=Integer.MIN_VALUE;
      int[][] arr = new int[n][n];
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
          {
              arr[i][j]=input.nextInt();

             if(i>1 && j>1) {
                 s = arr[i][j] + arr[i][j - 1] + arr[i][j - 2] +
                         arr[i - 1][j-1] +
                         arr[i - 2][j] + arr[i - 2][j - 1] + arr[i - 2][j - 2];
                 max = Math.max(max, s);
             }
              //System.out.println("3 result : "+max);
          }
      }
     System.out.println("Final result : "+max);

  }
}
