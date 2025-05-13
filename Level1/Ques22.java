// Sum of two array . 

import java.util.*;
public class Ques22 {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    // creating first array.
      System.out.println("enter the size of a1 :");
      int n1 = sc.nextInt();
       
      int[]a1 = new int[n1];

      System.out.println("enter the number in a1 :");
       for(int i = 0 ; i < a1.length ; i++){
          a1[i] = sc.nextInt();
       }

       // creating second array .
       System.out.println("enter the size of a2 :");
       int n2 = sc.nextInt();

       int[]a2 = new int [n2];

       System.out.println("enter the number in a2 :");
       for(int i = 0 ; i < a2.length ; i++){
           a2[i] = sc.nextInt();
       }

       // creating new array to store sum of two array.

       int[]sum = new int[n1 > n2 ? n1 : n2] ;
       
       // we need i , j ,c (carry) , k for traversing.
       
       int c = 0 ;
       int i = a1.length - 1 ;
       int j = a2.length - 2 ;
       int k = sum.length - 1 ;

       while( k >= 0){
          int d = c ;
          if( i >= 0){
            d = d + a1[i] ;
          }
          if( j >= 0){
            d = d + a2[j] ;
          }
          c = d / 10 ;
          d = d %  10 ;
          sum[k] = d ;
          i-- ;
          j-- ;
          k-- ;
       }
       if( c != 0){
        System.out.println(c);
       }
       System.out.println("sum of two array is :");
       for(int val = 0 ; i < sum.length ; val++){
           System.out.println(sum[val]);
       }
   }  
}
