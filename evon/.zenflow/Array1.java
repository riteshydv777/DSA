
// Reverse Array

import java.util.*;

public class Array1 {

    // display()....
    public static void display(int[]arr){
        for(int i = 0 ; i <= arr.length-1 ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();

        // declare an array
        int[] arr = new int[n];

        System.out.println("enter the element in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // display
        System.out.println("your array : ");
        display(arr);

        // reverse an array
        int i = 0 ;
        int j = arr.length-1;

        while(i != j){
            // swap
            int temp = arr[i];
            arr[i] = arr[j] ;
            arr[j] = temp ;

            i++;
            j--;
        }

        // display
        System.out.println("\n"+"after reverse : ");
        display(arr);

    }
}
