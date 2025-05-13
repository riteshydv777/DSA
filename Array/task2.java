// display an array using recursion.
// exp --> displayArr(arr,0)
// faith --> displayArr(arr,1)

import java.util.*;
import java.io.*;
public class task2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();
        //declare an array.
        int[]arr = new int[n];
        // take user input.
        System.out.println("enter the value in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();

        }
        // display an array.
        System.out.println("your array is :");
        displayArr(arr,0);
    }
    public static void displayArr(int[]arr , int indx ){
        // base case.
        if(indx == arr.length){
            return ;
        }
         
        System.out.print(arr[indx]+"\t");
        displayArr(arr , indx + 1) ;
    }
}
