// prime number

import java.util.*;
public class task17 {

    // prime number
    public static void primeSL(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            int n = arr[i] ;
            // check n is prime or not
             
            for(int div = 2 ; div*div <= n ; div++){
                if(n % div != 0){
                    arr[i] = n ;
                }
            }

            i++ ;

        }
    }

    // display 
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size : ");
        int n = sc.nextInt();
        // declare an array
        int[]arr = new int[n] ;
        // take user inpute
        System.out.println("enter the element in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // display your array
        System.out.println("your array is :");
        display(arr);

        System.out.println();
        primeSL(arr);

        System.out.println();
        display(arr);

    }
}
