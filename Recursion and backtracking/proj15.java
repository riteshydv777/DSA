// Find last index of occurance.

import java.io.*;
import java.util.*;

public class proj15 {
    public static void main(String[]args)throws Exception{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i]= sc.nextInt();

        }
        int x = sc.nextInt();
        int li = lastIndex(arr,0,x);
        System.out.println(li);
    }
    public static int lastIndex(int[]arr, int indx, int x){
        if(indx==arr.length){
            return -1;
        }
        int liisa = lastIndex(arr,indx+1,x);
        if(liisa==-1){
            if(arr[indx]==x){
                return indx;
            }else{
                return -1;
            }
        }else{
            return liisa;
        }
    }
}
