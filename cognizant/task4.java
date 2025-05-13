// count digit of number

import java.util.*;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();

        int dig = 0 ;
        while(n != 0){
            n = n/10 ;
            dig++ ;
        }
        System.out.println(dig+" digits present in given number.");
    }
}
