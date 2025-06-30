import java.util.ArrayList;
import java.util.List;

public class foreachmethod_java8_version {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(2);
        list.forEach(i -> System.out.println(i));

    }
}
