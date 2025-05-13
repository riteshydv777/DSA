// ncr = n!/(n-r)!*r! 

import java.util.*;
public class task8 {

    // f recursive function for finding factorial
    public static int fact(int n){
        if(n==0) return 1 ;
        else return fact(n-1)*n ;
    }
    // using formula and fact function
    public static int ncr(int n, int r){
        int num , den ;
        num = fact(n);
        den = fact(n-r)*fact(r) ;
        return num/den ;
    }

    // recursive function for ncr
    public static int NCR(int n , int r){
        if(r == 0 || n == r){
            return 1 ;
        }else{
            return NCR(n-1 , r-1) + NCR(n-1 , r) ;
        }

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter n : ");
         int n = sc.nextInt();
         System.out.println("enter r : ");
         int r = sc.nextInt();

         System.out.println(" using formula --> ncr = " +ncr(n,r));
         System.out.println("using pascal's triangle --> ncr = " +NCR(n,r));
    }
}
