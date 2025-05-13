// Rotate an array.

import java.util.*;
public class task27{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n];
        // take user inpute.
        System.out.println("enter the value in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display your array.
        System.out.println("your array is : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }

        System.out.println("\n"+"enter the value of k : ");
        int k = sc.nextInt();

        int[]ans = rotate(arr, k);
        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i]+"\t");
        }


    }
    public static int[] rotate(int[]arr , int k){
        int n = arr.length ;
        k = k % arr.length ;
        int[]ans = new int[n] ;
        int j = 0 ;
        
        for(int i = n - k ; i < n ; i++){
            ans[j++] = arr[i] ;
        }
        for(int i = 0 ; i < n - k ; i++){
            ans[j++] = arr[i]; 
        }
        return ans ;
    }
}
