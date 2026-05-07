
// two sum;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


import java.util.*;
public class Array8 {

    // twoSumOptimize()....
    public static int[] twoSumOptimize(int[]arr , int target){
        
        // declare resultant array
        int[] result = new int[2];

        int left = 0 ;
        int right = arr.length - 1 ;

        while(left != right){
            if(arr[left] + arr[right] == target){
                result[0] = left ;
                result[1] = right ;
                return result;
            }
            if(arr[left] + arr[right] < target)left++;
            else right--;
        }

        return new int[]{-1,-1} ;
    }


    
    // twoSum()  hashmap....
    public static int[] twoSum(int[]arr , int target){
        // create result array
        int[] result = new int[2];

        // declare hashmap
        HashMap<Integer,Integer> hm = new HashMap<>();

        // take element in hm from array
        for(int i = 0 ; i < arr.length ; i++){
            int x = arr[i] ;
            int extraNum = target - arr[i] ;

            if(hm.containsKey(extraNum)){
                result[1] = i ;
                result[0] = hm.get(extraNum);
            }else{
                hm.put(x, i);
            }
        }
        return result;
    }

    // display()....
    public static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = sc.nextInt();

        // declare an array...
        int[]arr = new int[n];

        // take user input
        System.out.println("enter element in an array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // display
        System.out.println("your array is :");
        display(arr);

        // target
        System.out.println("\n"+"enter target :");
        int target = sc.nextInt();

        // twoSum ---> best approch
        int[]ans = twoSum(arr,target);
        display(ans);

        // optimal approach two pointer
        System.out.println("\n"+"By two pointer approach :");
        int[] res = twoSumOptimize(arr, target);
        display(res);



    }
}
