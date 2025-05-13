/*    *****
 *    *****
 *    *****
 *    *****
 *    *****
 */

import java.util.*;
public class Pattern1{
    public static void main(String[]args){
       // System.out.println("ram");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        for(int i  = 1 ; i <= n ; i++){ // for row
            for(int j = 1 ; j <= n ;j++){ // for column 
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}