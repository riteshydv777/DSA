// Sliding window maximum.
// you are required to print maximum element in every window of size k.

// problem in this code.

import java.util.*;
import java.io.*;
public class ques35 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n];
        //take user inpute.
        System.out.println("enter the value inside array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display your array.
        System.out.println("\n"+"your array is : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n"+"enter window size : ");
        int k = sc.nextInt();

        //logic
        // next greater 
        Stack<Integer>st = new Stack<>();
        int[]nge = new int[arr.length];
        st.push(arr.length - 1 );
        nge[arr.length - 1] = arr.length ;
        
        for(int i = arr.length - 2 ; i >= 0; i--){
            while(st.size() == 0 && arr[i] > arr[st.peek()]){
                st.pop();
            }

            if(st.size() == 0){
                nge[i] = arr.length ; 
            }else{
                nge[i] = st.peek();
            }
            st.push(i);
        }

        int j = 0;
        for(int i = 0 ; i <= arr.length - k ; i++){
            if(j < i){
                j = i ;
            }
            while(nge[j] < i + k){
                j = nge[j] ; 
            }
            System.out.print(arr[j]+"\t");
        }

    }    
}
