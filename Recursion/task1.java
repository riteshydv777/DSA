
// print decreasing number

import java.util.*;

public class task1{

    public static void printDecreasing(int n){
        if(n > 0){
            System.out.print(n+" "); // print
            printDecreasing(n-1);  // recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        printDecreasing(n);

    }
}