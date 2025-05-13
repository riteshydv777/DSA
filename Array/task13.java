// search given element index  in array.

import java.util.*;
public class task13{
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

        // search given element index in array.
        System.out.println("\n"+"enter the element you want to search  :");
        int x = sc.nextInt();
        int indx = -1 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                indx = i ;
                break ;
            }  
        }

        System.out.println("\n"+"element is at index " +indx);
                
    }
}