
// count frequency of a string
// hello : h --1 , e --1 , l -- 2 , o -- 1

import java.util.*;
public class string4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String str = sc.nextLine();

        // display a string
        System.out.println("your string is :");
        System.out.println(str);

        // declare hashmap
        HashMap<Character,Integer> hm = new HashMap<>();

        // take element in hm from array of string

        for(int i = 0 ; i <= str.length()-1 ; i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                int x = hm.get(ch);
                hm.put(ch, x+1);
            }else{
                hm.put(ch,1);
            }
        }

        System.out.println(hm);

        // print
        for(int i = 0 ; i <= str.length()-1 ; i++){
            char ch = str.charAt(i);

            if(hm.containsKey(ch)){
                System.out.println(ch+ " --> " +hm.get(ch));
                hm.remove(ch);
            }
        }
    }
}
