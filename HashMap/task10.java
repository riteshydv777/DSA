// Majority element

import java.util.*;
public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array : ");
        int n = sc.nextInt();
        // declare array length
        int[]arr = new int[n] ;
        // take user inpute
        System.out.println("enter the value in array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // display array
        display(arr);

        // majority element
        System.out.println();
        int ans = MajorityEle(arr);
        System.out.println(ans);

    }
     // Majority element
     public static int MajorityEle(int[]arr){
        // declare Hashmap
        HashMap<Integer,Integer> hm = new HashMap<>();

        // take element into hashmap
        for(int i = 0 ; i < arr.length ; i++){
            if(hm.containsKey(arr[i])){
                int of = hm.get(arr[i]);
                int nf = of + 1 ;
                hm.put(arr[i] , nf);
            }else{
                hm.put(arr[i] , 1);
            }
        }
        int n = arr.length ;
        // traverse hashmap
        for(int val : arr){
            if(hm.get(val) > n/2){
                 return val ;
            }
        }
        return -1 ;
     } 

     // display array
     public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
