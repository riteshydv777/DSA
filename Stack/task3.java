// Insert at botton / any index

import java.util.*;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declare stack
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st+" and size is : " +st.size());

        System.out.println("enter the index : ");
        int idx = sc.nextInt();
        
       
        System.out.println("enter the value : ");
        int x = sc.nextInt();

        // declare new stack
        Stack<Integer> temp = new Stack<>();

        while(st.size() > idx){
            temp.push(st.pop());
        }
        System.out.println(temp);

        st.push(x);

        while(temp.size() > 0){
            st.push(temp.pop());
        }

        System.out.println(st);
    }
}
