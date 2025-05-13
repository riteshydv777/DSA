// SPAN of a number

import java.util.*;
public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size :");
        int n = sc.nextInt();

        // declare an array
        int[]arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display your array
        System.out.println("your array of number is : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        // span --> max-min
        int max = arr[0] ;
        int min = arr[0] ;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i] ;
            }
            if(arr[i] < min){
                min = arr[i] ;
            }
        }
        System.out.println("\n"+"max number in your array is: " +max);
        System.out.println("min number in your array is: " +min);

        int span = max - min ;
        System.out.println("span is " +span);
    }
}
