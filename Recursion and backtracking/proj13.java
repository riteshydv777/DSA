//First index of occurance in array.
import java.io.*;
import java.util.*;

public class proj13 {
    public static void main(String[]args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int fi =  firstIndex(arr,0,d);
        System.out.println(fi);
    }
    public static int firstIndex(int[]arr, int indx ,int x){

        if(indx==arr.length){
            return -1;
        }
        int fiisa = firstIndex(arr,indx+1,x);
        if(arr[indx]==x){
            return indx;
    }else{
        return fiisa;
    }
}
}