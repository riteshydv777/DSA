// k sorted array
import java.util.*;
public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array : ");
        int n = sc.nextInt();
        // declare an array
        int[]arr = new int[n];
        // take user input
        System.out.println("enter the vale in array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value of k : ");
        int k = sc.nextInt();
        // display
        display(arr);

        System.out.println();

        kSorted(arr, k);

    }
    // k sorted array
    public static void kSorted(int[]arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i <= k ; i++){
            pq.add(arr[i]);
        }
        for(int i = k+1 ; i < arr.length ; i++){
            System.out.print(pq.remove()+" ");
            pq.add(arr[i]);
        }
        while(pq.size() > 0){
            System.out.print(pq.remove()+" ");
        }
    }
    // display an array 
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
