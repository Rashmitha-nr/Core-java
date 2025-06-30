import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**class came implements Consumer<Integer>{
    @Override
    public void accept(Integer i) {
        System.out.println(i);

    }
}*/

public class fuctional_interface {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);

       /** Consumer<Integer> obj= new Consumer<Integer>() {// using anonymous inner class
            @Override
            public void accept(Integer i) {
                System.out.println(i);

            }
        };
        list.forEach(obj);*/
       Consumer<Integer> obj=integer -> System.out.println(integer); //using lambda function
       list.forEach(obj);

    }
}
