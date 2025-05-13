// fibonacci number

import java.util.*;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size :");
        int n = sc.nextInt();

        int a = 0 ;  // first fibonacci
        int b = 1 ;  // second fibonacci

        for(int i = 0 ; i < n ; i++){
            System.out.print(a+" ");
            int c = a + b ;
            a = b ; 
            b = c ;
        }
    }
}
