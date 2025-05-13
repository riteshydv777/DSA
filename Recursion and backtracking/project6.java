//calculate power (x,n) using recursion.

import java.io.*;
import java.util.*;

public class project6 {
    
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter value of x");
    int x = sc.nextInt();
    System.out.println("enter the value of n");
    int n = sc.nextInt();
    int xn = power(x,n);
    System.out.println(xn);
  }

  public static int power(int x, int n){
   
    if(n==0){
        return 1;
    }

    int xnm1 = power(x,n-1);
    int xn = x*xnm1;
    return xn;
  }

}
