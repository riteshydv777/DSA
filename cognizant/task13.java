// single number . leetcode = 136
// every element appears twice except for one find that single

import java.util.*;
public class task13 {

    // return the number that appears one time
    public static void single(int[]arr){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(hm.containsKey(arr[i])){
                int of = hm.get(arr[i]);
                int nf = of + 1 ;
                hm.put(arr[i] , nf);
            }else{
                hm.put(arr[i] , 1);
            }
        }

        for(int val : arr){
            if(hm.get(val) == 1){
                System.out.println(val);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size :");
        int n = sc.nextInt();

        // declare an array
        int[]arr = new int[n] ;
        // take user input
        System.out.println("enter element :");
        for(int i = 0  ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // your array is
        System.out.println("your array is :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("");
        single(arr);

    }
}
