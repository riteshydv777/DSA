// two sum
// Problem Statement: Given an array of integers arr[] and an integer target.
// 2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.
// method 1 : using loops
// method 2 : using hashmap

import java.util.*;
public class task12 {

    // two sum
    public static int[] twoSum(int[]arr , int target){
        int[] ans = new int[2] ;
        ans[0] = ans[1] = -1 ;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    ans[0] = i ;
                    ans[1] = j ;
                    return ans ;
                }
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size :");
        int n = sc.nextInt();
 
        // declare an array
        int[]arr = new int[n];
        // take user input in an array
        System.out.println("take element in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display array
        System.out.println("your array is :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        // two sum
        
        System.out.println("\n"+"enter target :");
        int target = sc.nextInt();

        int[]ans = twoSum(arr, target);
        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
