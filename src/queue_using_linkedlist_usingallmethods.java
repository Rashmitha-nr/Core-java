import java.util.LinkedList;
import java.util.Queue;

public class queue_using_linkedlist_usingallmethods {
    public static void main(String[] args) {
        Queue<Integer> num=new LinkedList<>();
        num.add(1);
        num.offer(2);
        num.add(3);
        num.add(4);
        num.offer(5);
        System.out.println(num);
        System.out.println("Size:"+num.size());
        System.out.println("peak:"+num.peek());
        num.poll();
        System.out.println("poll:"+num);
        num.poll();
        System.out.println("poll:"+num);
        num.remove();
        System.out.println("remove:"+num);
        System.out.println(num.contains(1));
        num.clear();
        System.out.println(num);





    }
}
