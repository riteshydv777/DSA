// Find the minimum number of brackets that we need to 
// remove to make the given bracket sequence balanced.

import java.util.*;
public class task11 {
    public static int bracketNumber(String str){
        // declare stack
        Stack<Character> st = new Stack<>();
        // traverse character
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(ch == '('){   // ch == '('
                st.push(ch);
            }else{           // ch == ')'
                if(st.size() == 0){
                    st.push(ch);
                }else{
                    if(st.peek() == '('){
                        st.pop() ;
                    }else{
                        st.push(ch);
                    }
                }  
                
            }
        }
        return st.size() ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character : ");
        String str = sc.nextLine();
        System.out.println("your character is : "+str);

        System.out.println("number of brackets removed is : "+bracketNumber(str));

    }
}
