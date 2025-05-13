// you aare given an array , that represent the height of bars in a bar chart.
// youn are required to find and print the area of largest rectangle in the histogram.

import java.util.*;
import java.io.*;
public class ques34 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        // declare an array . 
        int[]arr = new int[n] ;
        //take user input .
        System.out.println("enter the value inside array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        //display your array .
        System.out.println("\n"+"your array is that represent bar chart : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }

        // next smaller element on right.
        int[]rb = new int[arr.length];

        Stack<Integer>st = new Stack<>();

        st.push(arr.length - 1);
        rb[arr.length - 1] = arr.length ;

        for(int i = arr.length - 2 ; i >= 0 ; i--){
            while(st.size() > 0 && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                rb[i] = arr.length ;
            }else{
                rb[i] = st.peek();
            }
            st.push(i) ;
        }

        // next smaller element on left.
        int[]lb = new int[arr.length];

       // Stack<Integer>st = new Stack<>();

        st.push(0);
        lb[0] = -1 ;

        for(int i = 0 ; i < arr.length ; i++){
            while(st.size() > 0 && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0 ){
                lb[i] = -1 ;
            }else{
                lb[i] = st.peek();
            }
            st.push(i);
        }   
        // Area .
        
        int maxArea = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            int width = rb[i] - lb[i] - 1 ;
            int area = arr[i] * width ;
            if(area > maxArea){
                maxArea = area ;
            }
        }
        System.out.println("\n"+"largest area of rectangle is : ");
        System.out.println(maxArea);
    }
}
