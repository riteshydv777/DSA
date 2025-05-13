// Number System 
// Dacimal to any Base . 

import java.util.*;
public class ques14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number : ");
        int n = sc.nextInt();

        System.out.println("enter the base : ");
        int base = sc.nextInt();

        int dtob = digittobase(n,base);
        System.out.println(dtob);
    }

    public static int digittobase(int n , int base){
        int rv = 0 ;
        int p = 1 ;
        while( n > 0 ){
            int dig = n % base ; 
            n = n / base ;
            rv = rv + dig * p ;
            p = p * 10 ;
        }
        return rv ;
    }
}
