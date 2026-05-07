
// Compress String (aaabb → a3b2)

import java.util.*;

public class string12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String str = sc.nextLine();
        System.out.println("your string is : " +str);

        // compress string
        String res = "";
        int count = 1 ;
        for(int i = 0 ; i < str.length() ; i++){
            if(i < str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                res = res + str.charAt(i) + "" +count;
                count = 1 ;
            }
        }

        System.out.println(res);
    }
}
