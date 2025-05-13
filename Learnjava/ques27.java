//First and Last index in array.

import java.util.*;
import java.io.*;
public class ques27 {
    public static void main(String[]args){
        //Scanner sc = new Scanner(System.in);
        //declare an array.
        int[]arr = {1,5,15,33,22,33,15,33,33,33,40,42};
        int data = 15 ;
        //display an array.
        System.out.println("your array is :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        // for first index.
        int low = 0 ;
        int high = arr.length - 1 ;
        int fi = -1 ;

        while( low <= high){
            int mid = (low + high) / 2 ;
            
            if(data > arr[mid]){
                low = mid + 1 ;
            }else if(data < arr[mid]){
                high = mid - 1 ;
            }else{
                fi = mid ;
                high = mid - 1 ;
            }
             
        }
        //System.out.println(fi);
        
        // last index . 
         low = 0 ;
         high = arr.length - 1 ;
         int li = -1 ;
         while( low <= high){
            int mid = (low + high) / 2 ;

            if(data > arr[mid]){
                low = mid + 1 ;

            }else if(data < arr[mid]){
                high = mid - 1 ;

            }else{
                li = mid ;
                low = mid + 1 ;
            }
         }
         System.out.println(fi);
         System.out.println(li);
    }
}
