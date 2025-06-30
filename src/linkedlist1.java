import java.util.LinkedList;
import java.util.List;

public class linkedlist1 {
    public static void main(String[] args) {
        List<String> cardetails=new LinkedList<>();
        cardetails.add("KA8951");
        cardetails.add(1,"BMW");
        System.out.println(cardetails);
        System.out.println(cardetails.size());
        cardetails.addFirst("white");
        System.out.println("addedFV:"+cardetails);
        cardetails.addLast("6000000");
        System.out.println("addedLV:"+cardetails);
        cardetails.removeFirst();
        System.out.println("removedFV:"+cardetails);
        cardetails.removeLast();
        System.out.println("removedFV:"+cardetails);
        System.out.println(cardetails.get(1));
        System.out.println(cardetails.contains(1));
        cardetails.clear();
        System.out.println(cardetails);



    }
}
