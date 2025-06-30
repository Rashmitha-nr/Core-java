import java.util.Arrays;
import java.util.List;

public class methods_for_stream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,5,2,7,9,4,1);
        System.out.println(list);
        list.stream().sorted().forEach(System.out::println);
        System.out.println();
        list.stream().distinct().forEach(System.out::println);
        System.out.println();
        list.stream().skip(2).forEach(System.out::println);
        System.out.println();
        long i=list.stream().count();
        System.out.println(i);


    }
}
