// Binary search in array.

import java.util.*;
public class Ques26 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();

        // decalare an array.
        int[]arr = new int[n];
        //take usser inpute.
        System.out.println("enter the number in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("data you want to search : ");

        int data = sc.nextInt();
        // binary search .
        int lo = 0 ;
        int hi = arr.length-1 ;
        System.out.println("your data is ata index :");
        while(lo <= hi){
            int mid = (lo + hi)/2 ;
            if(data > arr[mid]){
                lo = mid + 1 ;
            }else if(data < arr[mid]){
                hi = mid - 1 ;
            }else{
                System.out.println(mid);
                return ;
            }

        }
        System.out.println(-1);
    }
}
