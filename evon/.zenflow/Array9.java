// Bubble sort
// selection sort 
// insertion sort


import java.util.*;

public class Array9 {

    // insertionSort()....
    public static void insertionSort(int[]arr){
        for(int i = 1 ; i < arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev +1] = curr;
        }
    }

    // SelectionSort()....
    public static void SelectionSort(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            int smallestIdx = i ;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] < arr[smallestIdx]){
                    smallestIdx = j ;
                }
            }

            // swap(arr[i] , arr[smallest])
            swap(arr, i, smallestIdx);

        }
    }
    // BubbleSort()....
    public static void BubbleSort(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length - 1 - i ; j++){
                if(arr[j] > arr[j+1]){
                    // swap(j,j+1)
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
    }

    // swap()...
    public static void swap(int[]arr , int i , int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;

    }

     // display()....
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();

        // declare an array...
        int[]arr = new int[n];

        // take user input
        System.out.println("enter element in an array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // display
        System.out.println("your array is :");
        display(arr);


        // sort an array
        // bubble sort

        // System.out.println("\n"+"bubble sort :");
        // BubbleSort(arr);
        // display(arr);

        // selection sort....
        // System.out.println("\n"+"selection sort :");
        // SelectionSort(arr);
        // display(arr);

        // insertionsort()....
        System.out.println("\n"+"insertion sort :");
        insertionSort(arr);
        display(arr);


        
    }
}
