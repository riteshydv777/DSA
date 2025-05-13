 // Taylor series
 
 import java.util.*;

 public class task7{

   public static double e(int x , int n){
        double p = 1 ;
        double f = 1 ;
        double r ;

        if(n==0) return 1 ;

        r = e(x,n-1);
        p = p*x ;
        f = f*n ;
        return r+p/f ;
    }
    public static void main(String[] args) {
         System.out.println(e(3,10));
    }
 }