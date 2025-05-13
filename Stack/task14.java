// Next Greater element
// arr : 1 3 2 1  8  6 3  4
// ans : 3 8 8 8 -1 -1 4 -1
// method (1) 
// this is iterative method. time complexity = O(n^2) , space complexity = O(1)

import java.util.*;
public class task14 {
    public static void main(String[] args) {
        // declare an inpute array
        int[]arr = {1,3,2,1,8,6,3,4} ;
        int[]ans = new int[arr.length] ;

        for(int i = 0 ; i < arr.length ; i++){
            ans[i] = -1 ;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] > arr[i]){
                    ans[i] = arr[j] ;
                    break ;
                }
            }
        }
        // display
        for(int i = 0 ; i < arr.length ; i++) System.out.print(arr[i]+" ");
        System.out.println();
        for(int i = 0 ; i < ans.length ; i++) System.out.print(ans[i]+" ");
        
    }
}
