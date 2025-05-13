// Given an array consisting of integers. Return  the first value that
// is repeating in this array.
// if no no value is repeated , return -1.
// array = 1 5 3 4 6 3 4 
// ans = 3 

import java.util.*;
public class task23{
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
        // first repeating number in array is .
        System.out.println("\n"+" first repeating of your array is : "+firstRepeating(arr));

    }
    public static int firstRepeating(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    return arr[i] ;
                }
            }
        }
        return -1 ;
    }
}        