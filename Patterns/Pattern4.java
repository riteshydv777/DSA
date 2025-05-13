//          *   ( 4  1 ) 
//        * *   ( 3  2 )
//      * * *   ( 2  3 )
//    * * * *   ( 1  4 )
//  * * * * *   ( 0  5 )

import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size : ");
        int n = sc.nextInt();

        int sp = n - 1 ;
        int st = 1 ;

        for(int i = 1 ; i <= n ; i++){
            //for space
            for(int j = 1 ; j <= sp ; j++){
                System.out.print("\t");
            }
            // for star
            for(int j = 1 ; j <= st ; j++){
                System.out.print("*\t");
            }
            sp-- ;
            st++ ;
            System.out.println();
        }
    }
}
