import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        Queue<Integer> names=new PriorityQueue<>();
        /**names.add("rashmi");
        names.add("nikhil");
        names.add("taanishqka");
        names.offer("mahima");
        System.out.println(names);
        System.out.println(names.peek());//it ll fetch the lowest value like smallest one
        names.poll();
        System.out.println(names);//for strings it follow alphabetic order*/

        names.add(5);
        names.add(2);
        names.add(3);
        System.out.println(names);
        System.out.println(names.peek());




    }
}
