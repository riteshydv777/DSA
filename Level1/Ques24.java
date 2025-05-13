//inverse of an array.

import java.util.*;
public class Ques24 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n];
        // take inpute from user.
        System.out.println("enter the number in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();

        }
        int[]invarr = invarr(arr);
        System.out.println("your inverted array is :");
        display(invarr);
        
    }
    // function for inverse of an array.
    public static int[]invarr(int[]arr){
        // declare new array.
        int[]invarr = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            int val = arr[i];
            invarr[val] = i ;
        }
        return invarr ;
    }

     public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
     }

}
