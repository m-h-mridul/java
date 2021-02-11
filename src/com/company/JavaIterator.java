package com.company;
import java.util.ArrayList;
import java.util.Iterator;
public class JavaIterator {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        //Object a=new Object("A");
        // Iterator to traverse the list
        Iterator iterator = list.iterator();

       System.out.println("Delate elements : ");
        while (iterator.hasNext()){
            Object ob=iterator.next();
            if(!ob.equals("B"))
                iterator.remove();
            else
            System.out.print(ob + " ");
       //System.out.println();
    }
    }
}
