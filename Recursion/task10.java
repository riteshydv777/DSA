// display array by recursion

import java.util.*;
public class task10 {

    public static void display(int[]arr , int idx){
        if(idx == arr.length) return ;   // base case
        System.out.println(arr[idx]);    // print
        display(arr, idx+1);             // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        // declare an array
        int[]arr = new int[n] ;
        // take user inpute.
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // dislay your array
        System.out.println("your array is : ");
        display(arr,0);
    }
}
