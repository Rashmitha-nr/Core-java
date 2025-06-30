import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_queue_using_Stack {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        queue.add(8);
        queue.add(1);
        queue.add(0);
        queue.add(4);
        System.out.println("original queue:"+queue);

        while(!queue.isEmpty()){ //will check whether the queue is empty or not empty ,if it is not empty it ll pull(remove) and store in  stack
            stack.push(queue.poll());// to add to stack we have used push(method)
        }
        while (!stack.isEmpty()){
            queue.offer(stack.pop());//to add to queue we have used offer()method;
        }
        System.out.println("reversed queue:"+queue);
    }
}
