// Array implemantation of stack 

public class task8 {
    // this is stack class
    public static class Stack{
        int[]arr = new int[5];

        // .....push().....[1]
        int idx = 0 ;
        void push(int x){   // insert data in stack
           
            arr[idx] = x ;
            idx++ ;
        }

        // .....peek().....[2]
        int peek(){
            if(idx == 0){
                System.out.println("stack is empty");
                return -1 ;
            }
            return arr[idx-1];
        }

        // .....pop().....[3]
        int pop(){
            if(idx == 0){
                System.out.println("stack is empty");
                return -1 ;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0 ;
            idx-- ;
            return top ;
        }

        // .....display().....[4]
        void display(){
            for(int i = 0 ; i<= idx-1 ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        // .....size().....[5]
        int size(){
            return idx ;
        }

        // .....capacity().....[6]
        int capacity(){
            return arr.length ;
        }

        // .....isEmpty()......[7]
        boolean isEmpty(){
            if(idx == 0) return true ;
            else return false ;
        }

        // .....isFull().....[8]
        boolean isFull(){
            if(idx == arr.length) return true ;
            else return false ;
        }

    }

    public static void main(String[] args) {
        // object of Stack class
        Stack st = new Stack();

        st.push(1); 
        st.display();  // 1

        st.push(2);
        st.display();  // 1 2 

        st.push(3); 
        st.display();  // 1 2 3

        st.push(4); 
        st.display();  // 1 2 3 4

        st.push(5);
        st.display();  // 1 2 3 4 5

        System.out.println("peek data is : "+st.peek());
        System.out.println("size of stack "+st.size());
        System.out.println("capacity of stack : "+st.capacity());
        System.out.println("is stack empty : "+st.isEmpty());
        System.out.println("is stack full : "+st.isFull());

        st.pop();
        st.display();  // 1 2 3 4

        st.pop();
        st.display();  // 1 2 3

        st.pop();
        st.display();  // 1 2

        st.pop();
        st.display();  // 1

        st.pop();
        st.display();  // empty stack.

        System.out.println("is stack empty : "+st.isEmpty());
        System.out.println("size of stack : "+st.size());

    }
}
