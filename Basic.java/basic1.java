// nCr = n!/r!(n-r)!


import java .util.*;
public class basic1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        System.out.println("enter r : ");
        int r = sc.nextInt();

        long res = ncr(n, r);
        System.out.println(res);

    }
    // ncr()
    public static long ncr(int n , int r){
        long ans = 1 ;
        for(int i = 0 ; i < r ; i++){
            ans = ans * (n-i);
            ans = ans / (i+1);
        }

        return ans;
    }
}