// Multiplication of two matrix.

import java.util.*;
public class task39{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         // Create matrix a.
         System.out.println("enter the number of rows for a : ");
         int r1 = sc.nextInt();
         System.out.println("enter the number of column for b : ");
         int c1 = sc.nextInt();

         int[][]a = new int[r1][c1];
         // take user input.
         System.out.println("enter the value in matrix a : ");
         for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                a[i][j] = sc.nextInt();
            }
         }

         // Create matrix b.
         System.out.println("enter the number of rows for b : ");
         int r2 = sc.nextInt();
         System.out.println("enter the number of column for b : ");
         int c2 = sc.nextInt();

         int[][]b = new int[r2][c2];
         // take user input.
         System.out.println("enter the value in matrix b : ");
         for(int i = 0 ; i < r2 ; i++){
            for(int j = 0 ; j < c2 ; j++){
                b[i][j] = sc.nextInt();
            }
         }

         System.out.println("\n"+"your matrix a : ");
         display(a);
         System.out.println("\n"+"your matrix b : ");
         display(b);

         multiple(a, r1, c1, b, r2, c2);


    }
    // multiple matrix a and matrix b.
    public static void multiple(int[][]a , int r1 , int c1 ,int[][]b , int r2 , int c2){
        // number of column of 1st matric must be equal to number of rows of 2nd matrix.
        if(c1 != r2){
            System.out.println("wrong inpute.");
            return ;
        }

        int[][]mul = new int[r1][c2];

        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                for(int k = 0 ; k < c1 ; k++){
                    // ith row of a * jth column of b.
                    mul[i][j] +=  a[i][k] * b[k][j] ;   
                }
            }
        }
        System.out.println("\n"+"multiplication of two matrixes a and b is : ");
        display(mul);
    }

    // display matrix 
    public static void display(int[][]matrix){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
 