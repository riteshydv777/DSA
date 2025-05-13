// Number system 
// Decimal to any base.

import java.util.*;
public class Ques16 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        System.out.println("enter the base :");
        int b = sc.nextInt();

        int gvib = getValueInBase(n,b);
        System.out.println(gvib);
    }

    public static int getValueInBase(int n , int b){
        int rv = 0 ;
        int pos = 1 ;
        while( n>0 ){
            int dig = n % b ;
             n = n / b ;
             rv = rv + dig * pos ;
             pos = pos * 10 ;
        }
        return rv ;
    }
}
