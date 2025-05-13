// Rotate matrix 90 degree clockwise.

import java.util.*;
public class task41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create matrix.
        System.out.println("enter the number of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][]matrix =  new int[r][c];
        // take user input.
        System.out.println("enter the value in matrix : ");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("your matrix is : ");
        display(matrix);
        //System.out.println("transpose of matrix is : ");
        // transpose(matrix, r, c);
        // display(matrix);

        System.out.println("rotated matrix is : ");
        rotate(matrix, r);
        display(matrix);
    }
    // rotate a matrix.
    public static void rotate(int[][]matrix , int n){
        // transpose.
        transpose(matrix, n, n);
        // reverse
        for(int i = 0 ; i < n ; i++){
            reverse(matrix[i]);
        }
    }
    // reverse 
    public static void reverse(int[]a){
        int i = 0 ;
        int j = a.length - 1 ;
        while(i < j){
            //swap
            int temp = a[i];
            a[i] = a[j] ; 
            a[j] = temp ;
            i++ ; 
            j-- ; 
        }
    }
    // transpose of matrix.
    public static void transpose(int[][]matrix , int r , int c){
        for(int i = 0 ; i < c ; i++){
            for(int j = i ; j < r ; j++){
                //swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i] ; 
                matrix[j][i] = temp ;
            }
        }
    }
    // display matrix.
    public static void display(int[][]matrix){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0  ; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
