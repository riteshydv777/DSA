//  *             ---> (1,1)  ---> if(i == j){sout(*)}
//    *           ---> (2,2)
//      *         ---> (3,3)
//        *       ---> (4,4)
//          *     ---> (5,5)

import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size : ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                // for star
                if(i == j){
                    System.out.print("*\t");
                }else{ // for space
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
