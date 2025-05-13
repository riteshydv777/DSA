// Display Reverse of an array using recursion.
// eg - 10 20 30 40 50 --> 50 40 30 20 10

import java.util.*;
public class task4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n] ;
        //take user input.
        System.out.println("enter the value in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display array.
        System.out.println("your array is :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        
        // reverse of an array.
        System.out.println("\n"+"reverse of an array is : ");
        displayreverse(arr,0);

        }

        public static void displayreverse(int[]arr , int indx){
            // base condition.
            if(indx == arr.length){
                return ;
            }
            displayreverse(arr , indx + 1);
            System.out.print(arr[indx]+"\t");
        

    }
}
