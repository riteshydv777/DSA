// Transpose of matrix.  a[i][j] = a[j][i].

import java.util.*;
public class task40 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        // create a matrix.
        System.out.println("enter the number of row and column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][]matrix = new int[r][c];
        // take user input
        System.out.println("enter value in matrix : ");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("your matrix is : ");
        displayMatrix(matrix);

        System.out.println("\n"+"transpose of matrix creating new matrix is : ");
        int[][]ans = transpose(matrix, r, c);
        displayMatrix(ans);

        System.out.println("\n"+"transpose of matrix without creating new matrix : ");
        transposeInPlace(matrix, r, c);
        displayMatrix(matrix);
    }
    // transpose of matrix inplace == without creating new matrix .
    public static void transposeInPlace(int[][]matrix , int r , int c){

        for(int i = 0 ; i < c ; i++){
            for(int j = i ; j < r ; j++){
                // swap (i , j) --> (j,i).
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp ;
            }
        }
    }

    // transpose of matrix using new matrix.
    public static int[][] transpose(int[][]matrix , int r , int c){
        int[][]tran = new int[c][r];
        for(int i = 0 ; i < c ; i++){
            for(int j = 0 ; j < r ; j++){
                tran[i][j] = matrix[j][i];
            }
        }
        return tran ;
    }

    // display your matrix.
    public static void displayMatrix(int[][]matrix){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
