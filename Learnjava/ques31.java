// Stack
// you are required to check if the expression is balanced  .

import java.util.*;
public class ques31 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the expression : ");
        String str = sc.nextLine();

        // declare a stack.
        Stack<Character>st = new Stack<>();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch) ;

            }else if(ch == ')'){
               boolean val = handlingchar(st , '(') ;
               if(val == false){
                System.out.println(val);
                return ;
               }
            }else if(ch == '}'){
                 boolean val = handlingchar(st , '{') ;
                 if(val == false){
                System.out.println(val);
                return ;
               }
            }else if(ch == ']'){
               boolean val = handlingchar(st , '[') ;
                if(val == false){
                System.out.println(val);
                return ;
               }
            }else{

            }
        } 
        
        if(st.size() == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
        public static boolean handlingchar(Stack<Character>st , char corresopeningch){
             if(st.size() == 0){
                return false ;
              }else if(st.peek() != corresopeningch){
                 return false ;
              }else{
                    st.pop();
                    return true ;
            }
        }
}
