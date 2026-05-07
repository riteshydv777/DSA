
// Longest Substring without Repeating Characters (Leetcode Medium) | Hashmap Interview Questions

import java.util.*;

public class string11 {

    public static int Solution(String str){
        int ans = 0 ;

        int i = -1 ;
        int j = -1 ;

        // declare hashmap
        HashMap<Character,Integer> map = new HashMap<>();

        while(true){
            boolean f1 = false;
            boolean f2 = false;

            // acquire untill becomes invalid
            while(i < str.length()-1){
                f1 = true;
                i++;
                char ch = str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0) + 1);

                if(map.get(ch) == 2){
                    break;
                }else{
                    int len = i - j;
                    if(len > ans){
                        ans = len;
                    }
                }
            }

            // release untill become valid....
            while(j < i){
                f2 = true;
                j++;
                char ch = str.charAt(j);

                map.put(ch, map.get(ch) - 1);

                if(map.get(ch) == 1){
                    break;
                }
            }

            if(f1 == false && f2 == false)
                break;
        }

        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string : ");
        String str = sc.nextLine();

        // sollution
        int ans = Solution(str);
        System.out.println(ans);

    }
}
