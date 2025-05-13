//Rotate a number .

import java.util.*;
public class Ques9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        System.out.println("enter the rotation : ");
        int k = sc.nextInt();
        
        // Find number of digits .
        int temp = n ;
        int nod = 0 ;
        while(temp != 0){
            temp = temp / 10 ;
            nod++ ;
        }
        System.out.println("number of digits is :" +nod);

        k = k % nod ;
        if(k < 0){
            k = k + nod ;
        }

        int div = 1 ;
        int mul = 1 ;
        for(int i = 1 ; i <= nod ; i++){
           if(i <= k){
              div = div * 10 ;
           }else{
              mul = mul * 10 ;
           }
        }
        int q = n / div ;
        int r = n % div ;
        int rotation = r * mul + q ;
        System.out.println("rotated number is :" +rotation);
    }
}
