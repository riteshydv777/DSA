import java.util.*;
public class task21 {
    // celebrity problem     
    public static int celebrity(int matrix[][] , int n){
        Stack<Integer> st = new Stack<>();

    for(int i = 0 ; i < n ; i++){
        st.push(i);
    }
    while(st.size() > 1){
        int v1 = st.pop() ;
        int v2 = st.pop();

        if(matrix[v1][v2] == 0){  // v1 may be celebrity.
            st.push(v1);
        }
        else if(matrix[v2][v1] == 0){ // v2 may be celebrity.
            st.push(v2) ;
        }
    }
    if(st.size() == 0) return -1 ;
    int potential = st.pop();
    for(int j = 0 ; j < n ; j++){
        if(matrix[potential][j] == 1) return -1 ;
    }
    for(int i = 0 ; i < n ; i++){
        if(i == potential) continue ;
        if(matrix[i][potential] == 0) return -1 ;
    }
     return potential ;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the size of square matrix");
        int n = sc.nextInt();

        // declare 2d arrray / matrix
        int[][] matrix = new int[n][n] ;
        // take user inpute
        System.out.println("enter row and column : ");
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix.length ; j++){
                matrix[i][j] = sc.nextInt();
            }
            
        }

        // display your matrix
        System.out.println("your matrix is : ");
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix.length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // celebrity
        int ans = celebrity(matrix, n) ;
        System.out.println(ans);
    }
}
