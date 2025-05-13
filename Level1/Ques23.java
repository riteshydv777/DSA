// REverse of an array.

import java.util.*;
public class Ques23 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // creating an array.
        System.out.println("enter the size of an array:");
        int n = sc.nextInt();
        int[]arr = new int[n];
        // take user input .  
        System.out.println("enter number in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("your array is:");
        for(int i = 0 ; i <arr.length ; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Your reversed array is :");
        reverse(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }   
        // reverse of an array .
        public static void reverse(int[]arr){
          int i = 0 ;
          int j = arr.length - 1 ;
           while(i < j){
            // swap.
             int temp = arr[i] ;
             arr[i] = arr[j] ;
             arr[j] = temp ;
             i++ ;
             j-- ;

           }
        }       

}
