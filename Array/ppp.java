import java.util.ArrayDeque;
import java.util.Deque;

public class ppp {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
deque.offerFirst("A");
deque.offerLast("B");
deque.offerFirst("C");
deque.offerLast("D");
System.out.print(deque.pollFirst() + " ");
System.out.print(deque.pollLast());
    }
}
