// Rotate a Number.

import java.util.*;
public class ques8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        System.out.println("enter the number by which you want to rotate : ");
        int k = sc.nextInt();

        // count number of digits.

        int temp = n ;
        int nod = 0 ;
        while( temp != 0){
            temp = temp / 10 ;
            nod++ ;
        }
        System.out.println("number of digits in given number is : " +nod);

        // For special case like negative number and modular.
        k = k  % nod ;
        if(k < 0){
            k = k + nod ;
        }

        int div = 1 ;
        int mult = 1 ;
        for(int i = 1 ; i <= nod ; i++){
            if(i <= k){
                div = div * 10 ;
            }
            else{
                mult = mult * 10 ;
            }
        }
        int q = n / div ;
        int r = n % div ;
        int rot = r * mult + q ;
        System.out.println("Rotated number is : " +rot);
    }
}
