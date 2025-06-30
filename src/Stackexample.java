import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stackexample {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        Queue<String>queue=new LinkedList<>();
        queue.add("R");
        queue.add("A");
        queue.add("S");
        queue.add("M");
        queue.add("I");

        System.out.println(queue);
        while (!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        System.out.println(queue);

    }

}
