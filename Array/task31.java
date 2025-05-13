// sort an array consisting 0 and 1.

import java.util.*;
public class task31 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n];
        // take user input in array
        System.out.println("enter the value in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display your array.
        System.out.println("your original array is : ");
        displayArray(arr);
        
        // call sortArray .

        sortArray(arr);
        System.out.println("\n"+"your sorted array is : ");
        displayArray(arr);

    }

    public static void sortArray(int[]arr){
        int i = 0 ;   // traverse from left to right
        int j = arr.length - 1 ;   // traverse from right to left.
        
        while(i < j){
            if(arr[i] == 1 && arr[j] == 0){
                //swap
                int temp = arr[i];
                arr[i] = arr[j] ;
                arr[j] = temp ;
                i++;
                j--;
            }
            if(arr[i] == 0){
                i++ ;
                //j-- ;
            }
            if(arr[j] == 1){
                j-- ;
            }
        }

    }

    // swapping an array.
     public static void swap(int[]arr){
        int i = 0 ;
        int j = arr.length - 1 ;
        while(i < j){
            int temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;
        }
     }
     // display your array : 
     public static void displayArray(int[]a){
        for(int i =0 ; i < a.length ;i++){
            System.out.print(a[i]+"\t");
        }
     }
}
