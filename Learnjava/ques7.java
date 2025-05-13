// Inverse of a number 

import java.util.*;
public class ques7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        
        int inv = 0 ;   // inverted digit initialy 0 .
        int op = 1 ;    // original place.
        int dig = 0 ;
        while(n != 0){
             int od = n % 10 ;
             int id = op ;
             int ip = od ;

             inv = inv + (id * (int) Math.pow(10, ip - 1));
             n = n / 10 ;
             op++ ;
        }
        System.out.println(inv);

    }
}
