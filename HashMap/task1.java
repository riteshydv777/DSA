// print maxximum frequency of character.
// i/n --> a b a c a b d c a
// o/p --> a

import java.util.*;
public class task1{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character : ");
        String str = sc.nextLine();
        // declare hashMap
        HashMap<Character , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i) ;
            if(hm.containsKey(ch)){
                int of = hm.get(ch);
                int nf = of + 1 ;
                hm.put(ch , nf) ;
            } else{
                hm.put(ch , 1);
            }
        }

        char mfc = str.charAt(0);
        // traverse keySet
        for(Character key : hm.keySet()){
            if(hm.get(key) > hm.get(mfc)){
                mfc = key ;
            }
        }
        System.out.println(mfc);

    }
}
