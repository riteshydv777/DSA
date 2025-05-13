// find the second largest element. 

import java.util.*;
public class task22{
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

        // second largest.
        System.out.println("\n"+"second largest element is : "+secondMax(arr));
    }

    // find largest element in array.
    public static int findMax(int[]arr){
        int max = Integer.MIN_VALUE;
        //int max = -1 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i] ;
            }
        }
        return max ;
    }

    // find second largest element in array.
    public static int secondMax(int[]arr){
        int max = findMax(arr);
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
                //arr[i] = -1 ;
            }
        }
        int secMax = findMax(arr);
        return secMax ;
    }
}        