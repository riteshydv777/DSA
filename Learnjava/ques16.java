// Find max and min in given array.  
// SPAN : max - min .
// ARRAY START

import java.util.*;
public class ques16 {
     public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of an array : ");
       int n = sc.nextInt();

       // declare array.
       int[]arr = new int[n] ;
       // take user input.
       System.out.println("enter the value in array : ");
       for(int i = 0 ; i < arr.length ; i++){
        arr[i] = sc.nextInt();
       }

       int max = arr[0] ; 
       int min = arr[0];

       for(int i = 1 ; i < arr.length ; i++){
         if(arr[i] > max){
            max = arr[i] ; 
         }
         if( arr[i] < min ){
            min = arr[i] ; 
         }
       }

       int span = max - min ;
       System.out.println(span);

     }     
    
}
