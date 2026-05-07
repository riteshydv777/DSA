
// Addition of two matrix

import java.util.*;

public class Array13 {

    // Addition of two matrix
    public static void addition(int[][]arr1 , int[][]arr2 , int r1 , int c1 , int r2 , int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Invalid input.");
        }

        int[][]sum = new int[r1][c1];

        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j] ;
            }
        }
        display(sum, r1, c1);
    }

    // display().....
    public static void display(int[][]arr , int r , int c){
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("enter size of row and coloumn for matrix 1 :");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        // declare matrix 1
        int[][] arr1 = new int[r1][c1];
        // take user input
        System.out.println("enter element in matrix 1 :");
        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the size of row and coloumn for matrix 2 :");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        // declare matrix 2 :
        int[][] arr2 = new int[r2][c2];
        // take user input
        System.out.println("enter element in mtrix 2 :");
        for(int i = 0 ; i < r2 ; i++){
            for(int j = 0 ; j < c2 ; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        // display arr1 and arr2....
        System.out.println("matrix 1 : ");
        display(arr1, r1, c1);

        System.out.println("\n"+"matrix 2 : ");
        display(arr2, r2, c2);

        // Addition of two matrix.....
        System.out.println("addition of two matrix :");
        addition(arr1, arr2, r1, c1, r2, c2);

    }
}
