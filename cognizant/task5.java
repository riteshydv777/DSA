// print digits of a number

import java.util.*;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();

        // find number of digits 
        int nod = 0 ;
        int temp = n ;
        while(temp != 0){
            temp = temp/10 ;
            nod++ ;
        }

        System.out.println(nod+" digits present in given number.");

        int div = (int)Math.pow(10,nod-1);

        while(div != 0){
            int q = n / div ;
            System.out.print(q+" ");

            n = n % div ;
            div = div / 10 ;
        }
    }
}
