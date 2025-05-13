// sort an array consisting only 0 and 1 .


import java.util.*;
public class task30{
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
        sort(arr);
        System.out.println("your sorted array is : ");
        display(arr);


    }
    // sort an array.
    public static void sort(int[]arr){
        // count number of zeros.
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        System.out.println("\n"+"number of zero is : " +count);
         // 0 to count -1 .
         for(int i = 0 ; i < arr.length ; i++){
            if(i < count){
                arr[i] = 0 ;
            }else{
                arr[i] = 1 ;
            }
        }

    }
    // display array.

    public static void display(int[]arr){

        //System.out.println("\n"+"your array is :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }

    }
         

}        