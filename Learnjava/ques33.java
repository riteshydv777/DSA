//stock span.
// stock span is defined as the number of days passed between  the current day and the 1st day . 

import java.util.*;
import java.io.*;
public class ques33 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // declare an array.
        int[]arr = new int[n] ;
        // take user input .
        System.out.println("enter the value inside an array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        //display your array.
        System.out.println("your ARRAY is : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }

        //
        System.out.println();

        int[]span = solve(arr);

        for(int i = 0 ; i < span.length ; i++){
            System.out.print(span[i]+"\t");
        }
        //
    }
    // creating function for span.
    public static int[]solve(int[]arr){
        // our answered array .
        int[]span = new int[arr.length] ;
        // creating stack.
        Stack<Integer>st = new Stack<>();

        st.push(0);
        span[0] = 1 ;

        for(int i = 1 ; i < arr.length ; i++){
            while(st.size() > 0 && arr[i] > arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                span[i] = i + 1 ;
            }else{
                span[i] = i - st.peek();
            }
            st.push(i) ;
        }

        return span ;
    }
}
