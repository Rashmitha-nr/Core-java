import java.util.Stack;

public class Stackex {
    public static void main(String[] args) {
        Stack<String> demo=new Stack<>();
        demo.push("Rashmi");
        demo.push("Nikhil");
        demo.push("Taanishqka");
        demo.push("Mahima");
        System.out.println(demo);
        demo.pop();
        System.out.println("Pop:"+demo);
        System.out.println("grtvalue:"+demo.get(2));
        System.out.println("size:"+demo.size());
        demo.set(0,"rashmitha");
        System.out.println("set:"+demo);
        System.out.println(demo.peek());
        System.out.println(demo.contains("Nikhil"));
        demo.clear();
        System.out.println(demo);

    }
}
