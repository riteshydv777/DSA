//given an array , move all the even integers at the begining of the array.


import java.util.*;
public class task32{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();
        // declare an array. 
        int[]arr = new int[n];
        //take use input.
        System.out.println("enter the value in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display your array.
        System.out.println("your array is :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }

        
        sortparity(arr);

        System.out.println("\n"+"your sorted arrayy is : ");

        displayArray(arr);

    }

    //...... sort even first tthe odd........

    public static void sortparity(int[]arr){
        int i = 0 ;  // left pointer
        int j = arr.length - 1 ;  // right pointer.
        while(i < j){
            if(arr[i] % 2 == 1 && arr[j] % 2 == 0){
                // swap
                int temp = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;
                i++ ;
                j-- ;
            }
            if(arr[i] % 2 == 0){
                i++ ;
            }
            if(arr[j] % 2 == 1){
                j-- ;
            }
        }
    }

    // display your array : 
    public static void displayArray(int[]a){
        for(int i =0 ; i < a.length ;i++){
            System.out.print(a[i]+"\t");
        }
     }
}        