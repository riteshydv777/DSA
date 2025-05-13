// count sum.
// count the number of triplets whose sum is equal to the given value.

import java.util.*;
public class task20{
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
        // calling triplets function.
        System.out.println("\n"+"enter the target : ");
        int target = sc.nextInt();

        System.out.println("count of triplets sum is : " +triplets(arr,target));

    }
    // triplets sum .
    public static int triplets(int[]a , int target){
        int ans = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = i + 1 ; j < a.length ; j++){
                for(int k = j + 1 ; k < a.length ; k++){
                    if(a[i] + a[j] + a[k] == target){
                        ans++ ; 
                    }
                }
            }
        }
        return ans ;
    }
}        