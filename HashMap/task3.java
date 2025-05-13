// get common element
// a1 : 1 1 2 2 2 3 5
// a2 : 1 1 1 2 2 4 5
// ans: 1 1 2 2 5

import java.util.*;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of arr1 :");
        int n1 = sc.nextInt();
        System.out.println("enter the length of arr2 :");
        int n2 = sc.nextInt();

        // declare arr1
        int[]arr1 = new int[n1];
        // declare arr2
        int[]arr2 = new int[n2];

        // take element in arr1
        System.out.println("enter the value in arr1 : ");
        for(int i = 0 ; i < arr1.length ; i++){
            arr1[i] = sc.nextInt();
        }

        // take element in arr2
        System.out.println("enter the value in arr2 : ");
        for(int i = 0 ; i < arr2.length ; i++){
            arr2[i] = sc.nextInt();
        }

        
        // display arr1
        System.out.println("arr1 is : ");
        display(arr1);
        // display arr2
        System.out.println("\n"+"arr2 is : ");
        display(arr2);

        // get common
        System.out.println();
        getCommon(arr1, arr2);
    }

    // get common element
    public static void getCommon(int[]a1 , int[]a2){
        // declare hashMap
        HashMap<Integer , Integer> fmp = new HashMap<>();
        // traverse a1
        for(int val : a1){
            if(fmp.containsKey(val)){
                int of = fmp.get(val);
                int nf = of + 1 ;
                fmp.put(val , nf) ;
            }else{
                fmp.put(val , 1);
            }
        }
        // traverse a2
        for(int val : a2){
            if(fmp.containsKey(val) && fmp.get(val) > 0){
                System.out.print(val+" ");
                int of = fmp.get(val);
                int nf = of - 1 ;
                fmp.put(val , nf) ;
            }
        }
    }

    // display array
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
     }
}
