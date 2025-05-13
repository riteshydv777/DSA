// Given an integer array , return the prefix sum .

import java.util.*;
public class task34 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n];
        // take user inpute.
        System.out.println("enter the value in array : ");
        for(int i =0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("your array is : ");
        displayArray(arr);

        int[]pref = prefixSum(arr);

        // prefix sum with new array.
        System.out.println("\n"+"your prefix sum array is with new array : ");
        displayArray(pref);

        // prefix sum without new array.
        prefix(arr);
        
        System.out.println("\n"+"prefix sum without new array : ");
        displayArray(arr);


    }
    // prefix sum without creating new array.

    public static int[] prefix(int[]arr){
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i] + arr[i-1] ;
        }
        return arr ;
    }

    // Prfix sum with new array .

    public static int[] prefixSum(int[]arr){
        // create a new array for result
        int[]pref = new int[arr.length];

        // 1st integer is same.
        pref[0] = arr[0] ;

        for(int i = 1 ; i < arr.length ; i++){
            pref[i] = pref[i-1] + arr[i] ;
        }
        return pref ;
    }


    // display your array.
    public static void displayArray(int[]a){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+"\t");
        }
    }
}
