// implement class and objects

import java.util.*;
public class oops1{

    // creating user defined datatype.
    // this is class
    public static class Student{
        String name;
        int rno;
        double percent;
    }

    // creating function that display name 
    public static void fun(Student x){
        System.out.println(x.name);
        return;
    }

    public static void main(String[] args) {
        System.out.println("hello");
        // this is class object.

        Student x = new Student();

        x.name = "Ram" ;
        x.rno = 25 ;
        x.percent = 97.25 ;

        System.out.println(x.name);
        System.out.println(x.rno);
        System.out.println(x.percent);

        fun(x);

    }
}