// print the sum of value in a given range of indices
// from l to r .
// 1 based indexing.

import java.util.*;
public class task35 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n];
        // take user input
        System.out.println("enter the value in array : ");
        for(int i = 1 ; i <= arr.length  ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("your array is : ");
        displayArray(arr);

        System.out.println();
        int[]prefsum =  prefixSum(arr);

        System.out.println("prefix sum : ");
        displayArray(prefsum);

        System.out.println("enter the number of queries : ");
        int q = sc.nextInt();

        while(q -- > 0){
            System.out.println("enter range  :");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefsum[r] - prefsum[l-1] ;

            System.out.println("sum : "+ans);
        }
    }
    // prefix sum.
    public static int[] prefixSum(int[]arr){
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr ; 
    }
    // display your array.
    
    public static void displayArray(int[]a){
        for(int i = 1 ; i <= a.length + 1 ; i++){
            System.out.print(a[i]+"\t");
        }
    }
}
