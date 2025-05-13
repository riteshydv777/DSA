// check that prefic is equal to sufix.

import java.util.*;
public class task36 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  size of an array : ");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n];
        // take user input.
        System.out.println("enter the value in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\n"+"your array is : ");
        displayArray(arr);

        // total sum of array is.
        int sum = arraySum(arr);
        System.out.println("\n"+"sum is : "+sum);


        //prefix sum .
        prefixSum(arr);
        System.out.println("\n"+"your prefix sum is : ");
        displayArray(arr);

        // check preffix is equal to suffix.
        System.out.println("\n"+"subarray present or not : ");
        boolean ans = equalSum(arr);
        System.out.println(ans);
    }
    // prefix is equal to suffix.
    public static boolean equalSum(int[]arr){
        int totalSum = arraySum(arr);
        int prefSum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            prefSum = prefSum + arr[i] ; 
            int sufixSum = totalSum - prefSum ; 

            if(sufixSum == prefSum){
                return true ;
            }
        }
        return false ;

    }

    // total sum of an array.

    public static int arraySum(int[]arr){
        int totalSum = 0 ;
        for(int i = 0 ;i < arr.length ; i++){
            totalSum = totalSum + arr[i] ;
        }
        return totalSum ;
    }

    // prefix sum 

    public static int[] prefixSum(int[]arr){
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i] + arr[i-1] ;
        }
        return arr ;
    }


    // display your array.
    public static void displayArray(int[]a){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+"\t");
        }
    }
}
