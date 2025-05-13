
//Find maximum of array.

import java.io.*;
import java.util.*;

public class proj12 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i =0; i<arr.length ; i++){
            arr[i] = sc.nextInt();

        }
         int max = maxArray(arr,0);
        System.out.println(max);
          
    }    
    public static int maxArray(int[]arr,int indx){
        
        if(indx==arr.length-1 ){
            
            return arr[indx];
            
        }

        int misa = maxArray(arr, indx+1);
        if(misa>arr[indx]){
            System.out.println("max of array");
           return misa;
        }else{
            System.out.println("max of array");
            return arr[indx];
        }
    }
    
}
