// Binary search.

import java.util.*;
public class ques25 {
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
        System.out.println("data you want to search : ");
        int data = sc.nextInt();
    
        int low = 0 ;
        int high = arr.length - 1 ;
        while(low <= high){
            int mid = (low + high) / 2 ;
            if(data > arr[mid]){
                low = mid + 1 ;
            }else if(data < arr[mid]){
                high = mid - 1 ;
            }else{
                System.out.println(mid);
                return ;
            }
        }
        System.out.println(-1);
    }
}    
