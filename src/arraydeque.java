import java.util.ArrayDeque;
import java.util.Queue;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> num=new ArrayDeque<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.addLast(6);
        System.out.println("addL:"+num);
        System.out.println(num);
        num.addFirst(5);
        System.out.println("addF:"+num);
        num.addLast(6);
        System.out.println("addL:"+num);
        num.removeFirst();
        System.out.println("removeF:"+num);
        num.removeLast();
        System.out.println("removeL:"+num);


    }
}
