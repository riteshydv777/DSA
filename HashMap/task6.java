// Find k largest element in an array
import java.util.*;
public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter the length of array : ");
        int n = sc.nextInt();

        // declare an array
        int[]arr = new int[n] ;

        // take user input
        System.out.println("enter the value : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the value of k : ");
        int k = sc.nextInt();

        // display array
         System.out.println("your array is : ");
         display(arr);

        // call largestElement
        System.out.println();
        largestElement(arr, k);

        // call kthLargest
        System.out.println();
        int ans = kthLargest(arr, k);
        System.out.println(ans);

    }
    // kth largest element
    public static int kthLargest(int[]arr , int k){
        // declare priority queue
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        for(int i = 0 ; i < arr.length ; i++){
            pq1.add(arr[i]);
            if(pq1.size() > k) pq1.remove() ;
        }
        return pq1.peek() ;

    }
    // k largest element
    public static void largestElement(int[]arr , int k){
        // declare priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>() ;

        for(int i = 0 ; i < arr.length ; i++){
            if(i < k){
                pq.add(arr[i]);
            }else{
                if(arr[i] > pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while(pq.size() > 0){
            System.out.print(pq.remove()+" ");
        }
        
    }
    // display array
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
