// SPAN OF INPUT. --> Difference of max value and min value in array.
// 6 15 30 40 4 11 9 ---> 40 - 4 . 

import java.util.*;
public class Ques19 {
    public static void main(String[]args){
       Scanner sc =new Scanner(System.in);
       // create an array .
       System.out.println("enter the size of an array :");
       int n = sc.nextInt();

       System.out.println("enter the value :");
       int[]arr = new int[n];
       // take inpute from user .
       for(int i = 0 ; i < arr.length ; i++){
         arr[i] = sc.nextInt();
       }
       // approach
       int max = arr[0] ;
       int min = arr[0] ;
       for(int i = 1 ; i < arr.length ; i++){
          if(arr[i] > max){
            max = arr[i];
            
          }
          if(arr[i] < min){
            min = arr[i] ;
           
          }
       }
       System.out.println("max in given array is :" +max);
       System.out.println("min in given array is :" +min);
       int span = max - min ;
       System.out.println("difference of max and min is :" +span);
    }
}
