// find a uniqu number in a given array where all the elements are 
// being repeated twice with one value being unique

import java.util.*;
public class task21 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n];
        // take user input.
        System.out.println("enter the value in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display your array.
        System.out.println("\n"+"your array is : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        // call your function.
        System.out.println("\n"+"findUnique : " +findUnique(arr));

    }
    // function for find unique number.
    public static int findUnique(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1 ;
                    arr[j] = -1 ;
                }
            }
        }
        int ans = -1 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > 0){
                ans = arr[i] ;
            }
        }
        return ans ;
    }

}
