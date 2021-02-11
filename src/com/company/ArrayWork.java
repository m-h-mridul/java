package com.company;

public class ArrayWork {
    public static void main(String[] args) {
/*
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
*/
        System.out.println(canWin(4, new int[]{0, 1, 1, 0, 0, 1, 1, 0, 1}));
    }
  /*      scan.close();
    }*/

    public static boolean canWin(int leap, int[] game) {
        int i = 0, n = game.length/leap;
      while(true){

      }
    }
}
