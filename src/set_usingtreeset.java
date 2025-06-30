import com.sun.source.doctree.SeeTree;

import java.util.Set;
import java.util.TreeSet;

public class set_usingtreeset {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(8);
        set.add(9);
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println(set);

    }
}
