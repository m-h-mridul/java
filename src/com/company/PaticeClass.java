package com.company;

public class PaticeClass {
    public static void main(String []args){
     int number = 4;
     Object o;
        o = new Inner().new Private();
        System.out.println(number + " is " + ((PaticeClass.Inner.Private)o).poowerof2(number));
       // System.out.println(new Inner().new Private().poowerof2(number));
    }

    static class  Inner{
       private  class Private{
            private String poowerof2(int num){
                return (num & num-1)==0? "power of 2":"not power of 2";
            }

       }
    }

}
