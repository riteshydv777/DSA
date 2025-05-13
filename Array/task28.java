// Rotate an array without creating new array.

import java.util.*;
public class task28{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();
        // declare an array. 
        int[]arr = new int[n];
        //take use input.
        System.out.println("enter the value in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display your array.
        System.out.println("your array is :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n"+"enter the value of k : ");
        int k = sc.nextInt();         

        System.out.println("\n"+"after rotation : ");
        rotate(arr, k);

        display(arr);
    }
    // creating reverse() 
    public static void reverse(int[]arr , int i , int j){
        while(i < j){
            int temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;

            i++ ; 
            j-- ;
        }
        // System.out.println("\n"+"your reversed array is : ");
        // for(int k = 0 ; k < arr.length ; k++){
        //     System.out.print(arr[k]+"\t");
        // }
    }
    // rotate an array.
    public static void rotate(int[]arr, int k){
        int n = arr.length;
        // part1 --> 0 to n-k-1
        reverse(arr, 0, n-k-1);
        // part2 --> n-k to n-1.
        reverse(arr, n-k , n-1);
        // part --> all
        reverse(arr, 0, n-1);
    }
    // display your rotated array.
    public static void display(int[]a){
        System.out.println("your rotated array is : ");
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+"\t");
        }
    }
     
}        