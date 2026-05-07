
// Move Zeros to End

import java.util.Scanner;

public class Array3 {


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

        // move zero to end
        int j = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                // swap i,j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println();
        display(arr);
    }
}
