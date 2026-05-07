//Given an array of integers, your task is to count how many numbers are even and how many are odd.
//A number is:
//Even if it is divisible by 2
//Odd if it is not divisible by 2

import java.util.*;

public class Array7{

    // display()....
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();
        //  declare an array
        int[]arr = new int[n];
        // take user inpute
        System.out.println("enter the element in an array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // display
        System.out.println("your array is :");
        display(arr);

        // count even and odd numbr in an array.
        int odd = 0 ;
        int even = 0 ;

        for(int i =  0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                even++ ;
            }else{
                odd++;
            }
        }

        System.out.println();

        System.out.println("even number is : " +even);
        System.out.println("odd number is : " +odd);


    }
}