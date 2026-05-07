
// largest element in an array
// smallest element in an array.
// second largest element
// second smallest element

import java.util.*;

public class Array2 {


    // second largest element.
    public static int secondLargestElement(int[]arr){
        int largest = LargestElement(arr);
        int secLarge = -1 ;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > secLarge && arr[i] < largest){
                secLarge = arr[i];
            }
        }
        return secLarge ;
    }

    // smallestElement()....
    public static int smallestElement(int[]arr){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i <= arr.length-1 ; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    // LargestElement()....
    public static int LargestElement(int[]arr){
        int large = Integer.MIN_VALUE;
        for(int i = 0 ; i <= arr.length-1 ; i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }

    // display()....
    public static void display(int[]arr){
        for(int i = 0 ; i <= arr.length-1 ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the ssize of an array :");
        int n = sc.nextInt();

        // declare an array
        int[]arr = new int[n];

        System.out.println("enter the element in an array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // display()....
        System.out.println("your array is : ");
        display(arr);

        // largest element or maximum element in an array
        int largest = LargestElement(arr);
        System.out.println("\n"+"largest element is : " +largest);

        // smallest element or minimum element in an array
        int smallest = smallestElement(arr);
        System.out.println("smallest element is : " +smallestElement(arr));

        // second largest
        System.out.println("second largest element is : " +secondLargestElement(arr));


    }
}
