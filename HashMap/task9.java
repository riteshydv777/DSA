// single number --> leetcode 136
// arr = 4 1 2 1 2
// o/p = 4

import java.util.*;
public class task9 {
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
        // display
        System.out.println("your array is : ");
        display(arr);;
        // Method 1 for getting single element having space complexity = O(n) and time complexity = O(n)
        System.out.println("\n"+"single element using hashmap : ");
        SingleNum(arr);
        // Method 2 for geting single element having space complexity = O(1) and time complexity = O(n)
        System.out.println("single element using XOR : ");
        int ans = singleElement(arr);
        System.out.println(ans);
    }
    // single number
    public static void SingleNum(int[]arr){
        // declare hashmap
        HashMap<Integer,Integer> hm = new HashMap<>();
        // take element into hashmap
        for(int i = 0 ; i < arr.length ; i++){
            if(hm.containsKey(arr[i])){
                int of = hm.get(arr[i]);
                int nf = of + 1 ;
                hm.put(arr[i],nf);
            }else{
                hm.put(arr[i],1);
            }
        }
        // display hashmap
        System.out.println("HashMap contains : ");
        System.out.println(hm);
        for(int val : arr){
            if(hm.get(val) == 1){
                System.out.println(val);
            }
        }
    }
    
    // Method 2 which have O(1) spacecomplexity
    // this is only for those array which have only 1 element is single.

    public static int singleElement(int[]arr){
        int ans = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            ans ^=  arr[i] ;
        }
        return ans ;
    }

    // display array
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
