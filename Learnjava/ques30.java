// you are required to print true if you detect extra brackets.

import java.util.*;
public class ques30 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the character : ");
    String str = sc.nextLine();
    
    // declare a stack.
    Stack<Character>st = new Stack<>();

    for(int i = 0 ; i < str.length() ; i ++){
         char ch = str.charAt(i) ; 

         if(ch == ')'){
            if(st.peek() == '('){
                System.out.println(true);
                return ;
            }else{
                while(st.peek() != '('){
                    st.pop();
                }
                st.pop();
            }

         }else{
            st.push(ch);
         }

    }
     System.out.println(false);
}
 
}

