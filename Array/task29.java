// given q queries, check if the given number is presents in the 
// array or not.

import java.util.*;
public class task29 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n] ;
        // take user inpute.
        System.out.println("enter the value in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display your array.
        System.out.println("your array is : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }

        // frequency array.
        int[]freq = frequencyArray(arr);

        

        // take queries.
        System.out.println("\n"+"enter the queries : ");
        int q = sc.nextInt();

        while(q > 0){
            System.out.println("enter the number you want searched : ");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println(x+" present in array. ");
            }else{
                System.out.println(x+" not in array. ");
            }

            q-- ;
        }


    }
    // create an frequency array.
    public static int[]frequencyArray(int[]arr){
        // creating freq array
        int[]freq = new int[100003];

        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++ ;
        }
        return freq ;
    }
}
