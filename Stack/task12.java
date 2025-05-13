// check whether a given bracket sequence is valid or not.
// eg --> ([]){}  --> true 
// eg --> ([)]{}  --> false

import java.util.*;
public class task12 {
    public static boolean bracketSequence(String str){
        // declare stack
        Stack<Character> st = new Stack<>();
        // traverse characters
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if(ch == ')'){
                boolean val = handleCharacter(st , '(') ;
                if(val == false){
                    System.out.println(val);
                    return val ;
                }
            }else if(ch == '}'){
                boolean val = handleCharacter(st , '{') ;
                if(val == false){
                    System.out.println(val);
                    return val ;
                }
            }else if(ch == ']'){
                boolean val = handleCharacter(st , '[') ;
                if(val == false){
                    System.out.println(val);
                    return val ;
                }
            }else{

            }
        }
         
        if(st.size() == 0){
            return true ;
        }else{
            return false ;
        }
    }
    public static boolean handleCharacter(Stack<Character>st , char corresopeningch){
        if(st.size() == 0){
           return false ;
         }else if(st.peek() != corresopeningch){
            return false ;
         }else{
               st.pop();
               return true ;
       }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character : ");
        String str = sc.nextLine();
        System.out.println("your character is : "+str);

        System.out.println("Bracket Sequence is : "+bracketSequence(str));
    }
}
