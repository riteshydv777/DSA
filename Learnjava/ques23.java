// Inverse of an array.
/*
 *  3 4 1 2 0 ---> 4 2 3 0 1
 */

import java.util.*;
public class ques23 {

    //create a function to find inverse.
    public static int[]inverse(int[]a){
        int[]inv = new int[a.length];
        for(int i = 0 ; i < a.length ; i++){
            int v = a[i] ; 
            inv[v] = i ;
        }
        return inv ;
 
    }

    public static void display(int[]a){
        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }
    }
   

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // create an array
        int[]arr = new int[n];
        //take user input.
        System.out.println("enter the value in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int[] inv = inverse(arr);
        System.out.println("inverted array is : ");
        display(inv);

    }
}
