package com.company;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
class Student1{
    private static String name="";
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
    public void ahqym(){}

    public void  amftc(){}


}
public class JavaRefeation {
    public static void main(String[] args) {
        //Student1 st = new Student1();
        Class student = Student1.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }
}
