// 2D Array

import java.util.*;

public class Array12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of row ;");
        int row = sc.nextInt();
        System.out.println("enter the size of column :");
        int column = sc.nextInt();

        // declare 2d array
        int[][] matrix = new int[row][column];

        // take user inpute
        System.out.println("enter element in matrix :");
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // display
        System.out.println("your matrix is :");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
