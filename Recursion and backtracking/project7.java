
//power logarithmic using recursion

import java.io.*;
import java.util.*;

public class project7 {

  public static void main(String[]args)throws Exception{

     Scanner sc = new Scanner(System.in);
     System.out.println("enter value of n");
     int n = sc.nextInt();
     System.out.println("enter value of x");
     int x = sc.nextInt();
     int xn = power(x,n);
     System.out.println(xn);
  }
     public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnb2 = power(x,n/2);
        int xn = xnb2*xnb2;
        if(n%2==1){
            xn = xn*x;
        }
         
        return xn;

     }


}
     