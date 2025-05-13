// Display array in Reverse.

import java.util.*;
public class task3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();
        // declare an array .
        int[]arr = new int[n];
        //teke user input.
        System.out.println("enter the value in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display an array.
        System.out.println("your array is :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }

        // Reverse of an array.
        Reverse(arr);
    }
    public static void Reverse(int[]arr){
        int i = 0 ;
        int j = arr.length - 1 ;
        while( i < j ){
            int temp = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;

                i++ ;
                j-- ;
        }
        // reverse array .
        System.out.println("\n"+"your reverse array is :");
        for(int t = 0 ; t < arr.length ; t++){
            System.out.print(arr[t]+"\t");
        }
    }
}
