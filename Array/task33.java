// Given an integer array sorted in non decreasing order,
// return an array of square.

import java.util.*;
public class task33 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n];
        // take user input.
        System.out.println("enter the value in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("your array is : ");
        displayArray(arr);

        System.out.println();
        int[]ans = sortSquare(arr) ;
        displayArray(ans);
        
        System.out.println();
        reverse(ans);

        System.out.println(); 
        displayArray(ans);
        

    }

    // find sorted square of an array.

    public static int[] sortSquare(int[]arr){
        int i = 0 ;    // left pointer.
        int j = arr.length - 1 ;    // right pointer.
        // declare an array for result.
        int[]ans = new int[arr.length] ;
        int k = 0 ;  // for traversing an ans array.

        while(i <= j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k++] = arr[i] * ans[i] ;
                i++ ;
            }else{
                ans[k++] = arr[j] * arr[j] ;
                j-- ;
            }
        }
        return ans ;
    }
    // Reverse an array.
    public static void reverse(int[]arr){
        int i = 0 ;
        int j = arr.length - 1 ;
         while(i < j){
            int temp = arr[i] ; 
            arr[i] = arr[j] ;
            arr[j] = temp ;
            i++ ;
            j-- ;
         }
    }

    // display array.

    public static void displayArray(int[]a){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+"\t");
        }
    }
}
