
// rotate an array

import java.util.*;
public class Array11{

    // rotate()....
    public static void rotate(int[]arr , int k){
        int n = arr.length;

        k = k % n ;
        if(k < 0){
            k = k + n ;
        }

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);


    }

    // reverse()....
    public static void reverse(int[]arr,int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j] ;
            arr[j] = temp ;
            i++ ;
            j--;
        }
    }

    // display()....
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();

        // declare an array...
        int[]arr = new int[n];

        // take user input
        System.out.println("enter element in an array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // display
        System.out.println("your array is :");
        display(arr);

        // rotate an array....
        System.out.println("\n"+"enter k :");
        int k = sc.nextInt();
        rotate(arr, k);
        display(arr);

    }

}