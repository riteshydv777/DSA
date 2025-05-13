
import java.util.*;
public class ques37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int n = sc.nextInt();

        // declare an array.
        int[]arr = new int [n] ; 
        // take user input.
        System.out.println("enter the value in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();

        }

        display(arr);

         Stack<Integer> st = new Stack<>();

         for(int i = 0 ; i < arr.length ; i++){

            if(st.isEmpty()) st.push(arr[i]) ;
            if(st.peek() != arr[i]) st.push(arr[i]) ;

         }
         System.out.println("\n"+"your stack is : ");
         System.out.println(st);

         System.out.println(st.peek());

         while(st.size() > 0){
            for(int i = 0 ; i < arr.length ; i++){
                arr[i] = st.pop() ;
            }
         }
         System.out.println();
         display(arr);



    }
    // display array
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
