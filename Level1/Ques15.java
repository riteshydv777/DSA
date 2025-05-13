/// Digit frequency.
// find frequency of digit in given number.

import java.util.*;
public class Ques15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        System.out.println("enter the digit :");
        int d = sc.nextInt();

        int fre = getFrequency(n , d);
        System.out.println("frequency of given number is :" +fre);
        
    }

    // function for frequency of digit.

    public static int getFrequency(int n , int d){
        int rv = 0 ;
        while( n !=0 ){
            int dig = n % 10 ;
            n = n / 10 ;
            if(dig == d){
                rv ++ ;
            }
           
        }
         return rv ;
    } 

}
