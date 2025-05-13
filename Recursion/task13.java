// First index of occurrence in an array.

import java.util.*;
public class task13 {

    // find first index of occurrence of element in array using recursion
    public static int firstInsex(int[]arr , int idx , int x){
        if(idx == arr.length) return -1 ;

        if(arr[idx] == x) return idx ;
        else{
            int fiisa = firstInsex(arr, idx+1, x);
            return fiisa ;
        }

    }
    // find first index of occurrence of element in array without recursion
    
    // display array
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        // declare array
        int[]arr = new int[n] ;
        //take user inpute
        System.out.println("enter data : "+" ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("your array is : ");
        display(arr);

        System.out.println("\n"+"enter element : ");
        int d = sc.nextInt();

        System.out.println("first occurrence of element is : " +firstInsex(arr, 0, d));
       
    }
}
