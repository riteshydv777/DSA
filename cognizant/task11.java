// two sum problem
// Problem Statement: Given an array of integers arr[] and an integer target.
// 1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
// method 1 : using loops.
// method 2 : using hashmap.

import java.util.*;
public class task11 {
    
    // two sum problem using hashmap
    public static String twosum(int[]arr , int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int num = arr[i] ;
            int rem = target - num ;
            if(hm.containsKey(rem)){
                return "yes" ;
            }
            hm.put(arr[i], i) ;
        }
        return "no" ;
    }

    // two sum using loops
    public static String twoSum(int[]arr , int target){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    return "yes" ;
                }
            }
        }
        return "no" ;
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

        // target 
        System.out.println("\n"+"enter target :");
        int target = sc.nextInt();

        // two sum using loops.
        String ans = twoSum(arr, target);
        System.out.println(ans);

        // two sum using hashing.
        String ans2 = twosum(arr, target);
        System.out.println(ans2);
    }    
}
