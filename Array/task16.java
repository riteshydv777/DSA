//count the number of element strictly greater thanvalue x.

import java.util.*;
public class task16{

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

        System.out.println("\n"+"enter the value of x : ");
        int x = sc.nextInt();
        
        int ans = count(arr,x);
        System.out.println("count of greater element "+ans);

    }
    public static int count(int[]arr, int x){
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(x < arr[i]){
                count++ ; 
            }
        }
         return count ;
    }
}        
