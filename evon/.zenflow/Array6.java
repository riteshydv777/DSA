// Leet code 268 - Missing number.
// Input: nums = [3,0,1]
// Output: 2
// Explanation:
// n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

import java.util.*;
public class Array6 {

     // display()...
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // declare an array
        int[]arr = new int[n];
        // take user inpute
        System.out.println("enter the element in an array :");
        for(int i =0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // display array
        System.out.println("your array is :");
        display(arr);

        // missing number
        int totalSum = n*(n+1)/2 ;
        int arraySum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            arraySum = arraySum + arr[i];
        }
        int res = totalSum-arraySum ;
        System.out.println("\n"+"missing number is : " +res);

        sc.close();

    }
}
