// addition of two matrix.
         
import java.util.*;
public class task38 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // create matrix a .
        System.out.println("enter number of row for matrix a : ");
        int r1 = sc.nextInt();
        System.out.println("enter number of column for matrix a : ");
        int c1 = sc.nextInt();

        int[][]a = new int[r1][c1];
        // take user input.
        System.out.println("enter number in matrix a : ");
        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                a[i][j] = sc.nextInt();
            }
        }

        // create matrix b .
        System.out.println("enter number of row for matrix b : ");
        int r2 = sc.nextInt();
        System.out.println("enter number of column for matrix b : ");
        int c2 = sc.nextInt();

        int[][]b = new int[r2][c2];
        // take user input.
        System.out.println("enter number in matrix b : ");
        for(int i = 0 ; i < r2 ; i++){
            for(int j = 0 ; j < c2 ; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n"+"your matrix a is : ");
        display(a);

        System.out.println("\n"+"your matrix b is : ");
        display(b);

        // addition of two matrix.

        System.out.println("addition of matrix a and matrix b : ");
        add(a, r1, c1, b , r2 , c2);

    }

    // addition of two matrix.
    public static void add(int[][]a , int r1 , int c1 , int[][]b , int r2 , int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("invalid input.");
            return ;
        }
        int[][]sum = new int[r1][c1];
        
        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                sum[i][j] = a[i][j] + b[i][j] ;
            }
        }
        display(sum);
    }


    // display matrix.
    public static void display(int[][]matrix){
        for(int i = 0 ; i < matrix.length ; i++){   // rows
            for(int j = 0 ; j < matrix[i].length ; j++){    // column
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
