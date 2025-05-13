// Remove all the consecutive subsequence of length greater
// than or equal to 2 that contain same element.
// arr : 1 2 2 3 10 10 10 4 4 4 5 7 7 2
// ans : 1 3 5 2

import java.util.*;
public class task13 {
    // Remove all consecutive
    public static int[] remove(int[]arr){
        // Declare Stack
        Stack<Integer> st = new Stack<>();
        // Traverse array
        for(int i = 0 ; i< arr.length ; i++){
            if(st.size() == 0 || st.peek() != arr[i]){
                st.push(arr[i]) ;
            }else if(arr[i] == st.peek()){
                if(i == arr.length - 1 || arr[i] != arr[i+1]){
                    st.pop();
                }
            }
        }

        // Resultant array
        int[]ans = new int[st.size()] ;
        for(int i = ans.length - 1 ; i >= 0 ; i--){
            ans[i] = st.pop() ;
        }
        return ans ;
    }
    // display 
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();
        // declare ana array
        int[]arr = new int[n] ;
        // take user inputs
        System.out.println("enter the data : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display array
        System.out.println("your array is : ");
        display(arr); 
        System.out.println();
        int[]ans = remove(arr);
        display(ans);

    }
}
