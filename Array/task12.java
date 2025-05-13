// calculate the maximum value out of all the element in the array.

import java.util.*;
public class task12{
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

        // calculate maximum in array.
        int max = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i] ; 
            }
        }
        System.out.println("\n"+"maximum element in array is : " +max);

    }
}