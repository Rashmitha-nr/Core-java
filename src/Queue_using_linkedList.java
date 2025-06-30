import java.util.LinkedList;
import java.util.Queue;

public class Queue_using_linkedList {
    public static void main(String[] args) {
        Queue<String> names=new LinkedList<>();
        names.offer("rashmi");
        names.offer("nayana");
        names.offer("harshi");//insert elments
        System.out.println(names);
        System.out.println(names.peek());//fetch first element
        names.poll();//remove element as per FIFO
        System.out.println(names);

    }
}
