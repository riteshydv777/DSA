// count the number of occurance of a particular element x in array.

import java.util.*;
public class task14{

    public static int frequency(int[]arr , int x){
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                count++ ; 
            }
        }
        return count ;
    }
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

        System.out.println("\n"+"enter the element : ");
        int x = sc.nextInt();
        int ans = frequency(arr, x);
        System.out.println("number of count of element is : " +ans);
    }
}        