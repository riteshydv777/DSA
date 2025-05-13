// AnyBase to Decimal.
// Problem in  this code . 

import java.util.*;
public class ques15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n : ");
        int n = sc.nextInt();
        
        System.out.println("enter the base b : ");
        int b = sc.nextInt();

        int indeci = getIndecimal(n,b);
        System.out.println(indeci);
    }
    public static int getIndecimal(int n , int b){
        int rv = 0 ;
        int p = 1 ;
        while( n > 0 ){
            int dig = n % 10 ;
            n = n / 10 ;
            rv = rv + dig * p ;
            p = p * b ;
        }
        return rv ;
    }
}
