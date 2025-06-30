import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamexample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        System.out.println(list);
        Stream obj1=list.stream();
        obj1.forEach(System.out::println);



    }
}
