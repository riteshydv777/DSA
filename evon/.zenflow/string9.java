//Remove Spaces from String

import java.util.*;
public class string9 {
    public static void main(String[] args) {
        String str = "Hello world java" ;
        String result = " ";

        // logic 
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) != ' '){
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
