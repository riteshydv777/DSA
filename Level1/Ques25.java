// Subarray of an array.

import java.util.*;
public class Ques25 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();

        // decalare an array.
        int[]arr = new int [n];
        // take user inpute.
        System.out.println("enter number in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }  
        // subarray of an array.
        System.out.println("your subarray is :");
         for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                for(int k = i ; k <= j ; k++){
                    System.out.print(arr[k]+ "\t");
                }
                System.out.println();
            }
         }

    }
}
