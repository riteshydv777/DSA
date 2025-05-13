//... 2-Dimensional array....

import java.util.*;
public class task37 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row :");
        int r = sc.nextInt();
        System.out.println("enter the column :");
        int c = sc.nextInt();

        //declare 2d array.
        int[][]arr = new int[r][c];
        // take user input.
        System.out.println("enter the row and column :");
        
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("your 2d array is : ");
        display(arr);


        // declare an 2d array.
        int[][]arr1 = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                        } ;

        // display 2d array.
         System.out.println("\n"+"your 2d array is : ");
         display(arr1);
        

    }

    // print array function.
    public static void display(int[][]arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
