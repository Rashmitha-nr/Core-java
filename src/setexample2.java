import java.util.LinkedHashSet;
import java.util.Set;

public class setexample2 {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("monkey");
        set.add("dog");
        set.add("cat");
        set.add("lion");
        set.add("dog");
        System.out.println(set);
        set.remove("dog");
        System.out.println(set);
    }
}
