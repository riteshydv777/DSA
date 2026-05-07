
// Binary search

import java.util.*;
public class Array10 {

    // BinarySearch()....
    public static int BinarySearch(int[]arr , int target){
        int st = 0 ; int end = arr.length-1;

        while(st <= end){
            int mid = (st+end)/2 ;

            if(target > arr[mid]){
                st = mid+1 ;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                return mid ;
            }
        }
        return -1 ;
    }

      // display()....
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();

        // declare an array...
        int[]arr = new int[n];

        // take user input
        System.out.println("enter element in an array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // display
        System.out.println("your array is :");
        display(arr);

        // Binary Search....
        System.out.println("\n"+"enter the target :");
        int target = sc.nextInt();

        int ans = BinarySearch(arr, target);
        System.out.println(ans);

    }
}
