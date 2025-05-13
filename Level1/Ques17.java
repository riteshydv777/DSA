/// Any Base to decimal .

import java.util.*;
public class Ques17 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        System.out.println("enter the base :");
        int b = sc.nextInt();
        
        int gvid = getValueInDecimal( n , b);
        System.out.println(gvid);
    }

    public static int getValueInDecimal( int n , int b ){
        int rv = 0 ;
        int pos = 1 ;
         while( n>0 ){
            int dig = n % 10 ; 
             n = n / 10 ;
            rv = rv + dig * pos ;
            pos = pos * b ;
         }
         return rv ;
    }
}
