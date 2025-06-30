import java.util.PriorityQueue;

public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue<String> names=new PriorityQueue<>();
        names.offer("rashmitha");
        names.offer("nikitha");
        names.offer("mahima");
        names.offer("taanishqka");
        names.offer("simba");
        names.offer("nayana");
        System.out.println("original names:"+names);
        while(!names.isEmpty()) {
            System.out.println(names.poll());

        }

    }
}
