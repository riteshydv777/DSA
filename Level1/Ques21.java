// Bar chart ---> A asteriks representing value of array 

import java.util.*;
public class Ques21 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();

        // create an array .
        int[]arr = new int[n];
        // take user input in array .
        System.out.println("enter number in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // find maximun number in given array .
         int max = arr[0];
         for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i] ; 
            }

         }
         System.out.println("your maximum number in array is :" +max);
        
        // Bar chart approach .
        for(int floor = max ; floor >= 1 ; floor--){
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] >= floor){
                    System.out.print(" * \t ");
                }else{
                    System.out.print(" \t ");
                }
            }
            System.out.println();
        }
    }
}
