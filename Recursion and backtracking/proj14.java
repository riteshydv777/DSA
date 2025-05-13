//find first index of occurance.

// some problem in this programme.

import java.io.*;
import java.util.*;

public class proj14 {
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[]arr = new int[n];
       for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
       }
       int d = sc.nextInt();
       int fi = firstIndex(arr,0,d);
       System.out.println(fi);
   }
   public static int firstIndex(int[]arr, int indx, int x){
     if(indx==arr.length){
        return -1;
     }
       if(indx==x){
           return indx;
       }
       else{
            int fiisa = firstIndex(arr,indx+1,x);
            return fiisa;
       }
   }
}
