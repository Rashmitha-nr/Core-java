import java.util.ArrayList;
import java.util.List;

public class arraylistexample {
    public static void main(String[] args) {
        List<String> details=new ArrayList<>();
        details.add("Rashmitha");
        details.add("presidency university");
        details.add(2,"COM");
        details.add(3,"8951253830");
        details.add(4,"bangalore");
        System.out.println(details);
        System.out.println("size:"+ details.size());
        System.out.println("getvalue:"+ details.get(4));
        System.out.println("removed:"+ details.remove(2));
        System.out.println(details);
        details.set(2,"CSE");
        System.out.println(details);
        System.out.println(details.contains("Rashmitha"));

    }
}
