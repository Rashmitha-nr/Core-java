import java.util.List;
import java.util.Vector;

public class vectorexample {
    public static void main(String[] args) {
        List<String> RN=new Vector<>();
        RN.add("0");
        RN.add("2");
        RN.add("1");
        RN.add(3,"1");
        RN.add(4,"C");
        RN.add(5,"O");
        RN.add(6,"M");
        RN.add("0");
        RN.add("0");
        System.out.println(RN);
        System.out.println(RN.get(4));
        RN.addFirst("2");
        System.out.println("addedFV:"+RN);
        RN.addLast("8");
        System.out.println("addedLV:"+RN);
        System.out.println(RN.size());
        RN.removeLast();
        System.out.println("removedLV:"+RN);
        RN.removeFirst();
        System.out.println("removedFV:"+RN);
        System.out.println(RN.contains("C"));
        RN.clear();
        System.out.println(RN);






    }
}
