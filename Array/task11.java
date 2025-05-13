// calculate the sum of all the element in the given array.
// eg --> {1,5,3} , sum = 1+5+3 = 9.

import java.util.*;
public class task11 {

        public static int sumofarray(int[]arr){
        int sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i] ; 
        }
         return sum ;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        //declare an array.
        int[]arr = new int[n];
        //take user input.
        System.out.println("enter the element in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display your array.
        System.out.println("\n"+"your array is : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        // sum of element of array is .

          int ans = sumofarray(arr);
          System.out.println("\n"+"sum of array is : "+ans);
    }      
}
