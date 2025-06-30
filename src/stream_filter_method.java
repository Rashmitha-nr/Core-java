import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class stream_filter_method {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        System.out.println(list);

        /*Predicate<Integer> obj=new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i%2==0;
            }
        };*/
       /* list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i%2==0;
            }
        }).forEach(System.out::println);*/
        //list.stream().filter(i -> i%2==0).forEach(System.out::println);
       /* Function<Integer,Integer> f=new Function<Integer, Integer>() {//map interface
            @Override
            public Integer apply(Integer i) { //map method
                return i*2;
            }
        };*/
       /** BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer i, Integer j) {     //reduce method
                return i+j;
            }
        };*/
        Integer sum=list.stream()
                .filter(i -> i%2==0) //filter method
                .map(i -> i*2) //map method
                .reduce(0,(i, j) -> i+j);//reduce method
        System.out.println(sum);
        //forEach(System.out::println); //filter method

    }
}
