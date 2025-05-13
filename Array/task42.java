// two sum problem
// type 1 : find index of element that gives target value . 
// type 2 : if there is element that gives target value than return yes.
// type 3 : find number of all pairs that gives target value.

import java.util.*;
public class task42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array:");
        int n = sc.nextInt();
        // declare array
        int[]arr = new int[n];
        // take user input
        System.out.println("enter the element in array:");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("your array is : ");
        display(arr);

        System.out.println("\n"+"enter the target:");
        int target = sc.nextInt();

        // type 1 : 
        System.out.println("index are :");
        int[]ans = twoSumIndex(arr, target) ;
        display(ans);

        // type 2 :
        System.out.println("\n"+twoSumPre(arr, target));

        // type 3 :
        System.out.println("the total number of pairs in the array whose sum is equal to the given target is :");
        System.out.println(twoSumPairs(arr, target));

    }
    // twoSumPairs().....TYPE3......
    public static int twoSumPairs(int[]arr,int target){
        int ans = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    ans++ ;
                }
            }
        }
        return ans ;
    }
    // twoSumPre()......TYPE2.......
    public static boolean twoSumPre(int[]arr , int target){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    return true ;
                }
            }
        }
        return false ;
    }

    // twoSumIndex()...... TYPE 1 ......
    public static int[] twoSumIndex(int[]arr,int target){
        int[] res = new int[2];
        res[0] = -1 ;
        res[1] = -1 ;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    res[0] = i ;
                    res[1] = j ;
                    return res ;
                }
            }
        }
        return res ;
    }

    // display array
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
