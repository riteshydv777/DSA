// print increasing

import java.util.*;
public class task2 {
    public static void printIncreasing(int n){
        if(n == 0) return ;
        printIncreasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
