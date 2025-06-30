import java.util.ArrayDeque;

public class arraydeque_usingallmethods {
    public static void main(String[] args) {
        ArrayDeque<String> names=new ArrayDeque<>();
        names.offer("R");
        names.add("N");
        names.offer("B");
        System.out.println(names);
        names.offerFirst("C");
        System.out.println("offerF:"+names);
        names.offerLast("M");
        System.out.println("offerL:"+names);
        names.addFirst("E");
        System.out.println("addF:"+names);
        names.addLast("K");
        System.out.println("addL:"+names);
        System.out.println(names.size());
        names.removeFirst();
        System.out.println("removeF:"+names);
        names.removeLast();
        System.out.println("removeL:"+names);
        System.out.println(names.peek());
        names.pop();
        System.out.println("pop:"+names);
        names.push("A");
        System.out.println("push:"+names);
        names.poll();
        System.out.println("poll:"+names);
        System.out.println(names.contains("B"));
        names.clear();
        System.out.println(names);




    }
}
