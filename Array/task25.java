// swap the given two number using sum and difference

import java.util.*;
public class task25{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("enter the value of b : ");
        int b = sc.nextInt();

        // values beffore swapping.
        System.out.println("before swaping : ");
        System.out.println(" a : " +a);
        System.out.println(" b :" +b);

        // after swapping.
        
        a = a + b ;
        b = a - b ;
        a = a - b ;

        System.out.println("after swapping : ");
        System.out.println(" a : " +a);
        System.out.println(" b : " +b);
    }
}