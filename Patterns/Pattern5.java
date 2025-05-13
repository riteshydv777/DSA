// * * * * *   (0  5)
//   * * * *   (1  4)
//     * * *   (2  3)
//       * *   (3  2)
//         *   (4  1)

import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size : ");
        int n = sc.nextInt();

        int sp = 0 ;
        int st = n ;
        for(int i = 1 ; i <= n ; i++){
            // for space
            for(int j = 1 ; j <= sp ; j++){
                System.out.print("\t");
            }
            // for star
            for(int j = 1 ; j <= st ; j++){
                System.out.print("*\t");
            }
            sp++ ;
            st-- ;
            System.out.println();
        }

    }
}
