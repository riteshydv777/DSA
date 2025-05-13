// target sum.
//find the total number of pairs in the array whose sum is equal to the given target.

import java.util.*;
public class task19 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // declare ana array.
        int[]arr = new int[n];
        // take user inpute in array.
        System.out.println("enter the number in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        //display your array.
        System.out.println("your array is : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        // target sum.
        System.out.println("\n"+"enter the target : ");
        int target = sc.nextInt();

        int ans = 0 ;
        for(int i = 0 ; i < arr.length ;i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    ans++ ;
                }
            }
        }
        System.out.println(ans);
    }
}
