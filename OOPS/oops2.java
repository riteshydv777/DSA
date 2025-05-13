
import java.util.*;


public class oops2 {
 

    // creating user defined datatype
    // this is class.
    public static class Student{
        public String name;
        public int rno ; 
        public double percent ;
        
    
    public Student(String name, int rno, double percent) {
        this.name = name ;
        this.rno = rno ;
        this.percent = percent ;
    
        }
        public static void main(String[]args){
            Student s1 = new Student("Abhay",45,5.66);
            System.out.println(s1.name);
        }

  
}
}
