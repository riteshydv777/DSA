// next greater element on right.
// you are required to print "next greater element to the right" for all elements of array.


import java.util.*;
import java.io.*;
public class ques32 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();
        //declare an array.
        int[]a = new int[n] ;
        // take user input.
        System.out.println("enter the element in array : ");
        for(int i = 0 ; i < a.length ; i++){
            a[i] = sc.nextInt();
        }
        // display your array.
        System.out.println("your array is : ");
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+"\t");
        }
        // function for next greater element to right.
        int[]nge = solve(a) ;

        System.out.println();

        for(int i = 0 ; i < nge.length ; i++){
            System.out.print(nge[i]+"\t");
        }
        // display nge.
        // display(nge) ;

    }
    // creating function for nge to right.
    public static int[]solve(int[]arr){

        // nge array is our answer .
        int[]nge = new int[arr.length];
        // creating a stack .
        Stack<Integer>st = new Stack<>();

        // push the last element of a (array) to the stack.
        st.push(arr[arr.length - 1]);
        // take nge array last element is -1.
        nge[arr.length - 1] = -1 ;

        for(int i = arr.length - 2 ; i >= 0 ; i--){
            // pop , ans , push
            while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop() ;
            }
            if(st.size() == 0){
                nge[i] = -1 ;
            }else{
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge ;

         

    }
    // display 
    // public static void display(int[]a){
    //     StringBuilder sb = new StringBuilder();
    //     for(int val : a){
    //         sb.append(val+ "\n");
    //     }
    //     System.out.println(sb);
    // }
}
