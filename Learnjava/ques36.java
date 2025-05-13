// ArrayList.

import java.util.*;
public class ques36{
    public static void main(String[]args){
        // DECLARE AN ARRAYLIST.
        ArrayList<Integer>l1 = new ArrayList<>();
        
        // somr methods of arraylist
        // add element.
        l1.add(4);
        l1.add(7);
        l1.add(9);
        l1.add(1);
        // display arraylist
        System.out.println("arraylist print directly :");
        System.out.println(l1);
        // get element at index i.
        System.out.println(l1.get(0));
        // display using loop.
        System.out.println("arraylist ussing for loop :");
        for(int i = 0 ; i < l1.size() ; i++){
            System.out.println(l1.get(i));
        }

        // add element at some index . 
        l1.add(1,100);
        System.out.println(l1);

        // modifying element at index i .
        System.out.println("modifying arraylist is : ");
        l1.set(1,10);
        System.out.println(l1);

        // removing element at index i .
        l1.remove(1);
        System.out.println(l1);

        // remove element 
        l1.remove(Integer.valueOf(4));
        System.out.println(l1);
    }
}
 