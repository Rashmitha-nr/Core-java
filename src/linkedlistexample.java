import java.util.LinkedList;
import java.util.List;

public class linkedlistexample {
    public static void main(String[] args) {
        /***List<Integer> num=new LinkedList<>();
        num.add(12);
        num.add(34);
        num.add(45);
        System.out.println(num);
        num.addFirst(10);
        System.out.println("added firstvalue:"+num);
        num.addLast(50);
        System.out.println("added lastvalue:"+num);
        System.out.println(num.size());
        System.out.println(num.get(2));
        num.set(2,5);
        System.out.println("set:"+num);
        num.add(1,80);
        num.removeFirst();
        System.out.println("removedfirstvalue:"+num);
        num.removeLast();
        System.out.println("removedlastvalue:"+num);
        System.out.println(num.contains(34));
        num.clear();//it ll give empty list
        System.out.println(num);*/

        List<Integer> mobilenumber=new LinkedList<>();
        mobilenumber.add(9);
        mobilenumber.add(5);
        mobilenumber.add(1);
        mobilenumber.add(3,2);
        mobilenumber.add(4,5);
        mobilenumber.add(5,3);
        mobilenumber.add(8);
        mobilenumber.add(3);
        System.out.println(mobilenumber);
        System.out.println(mobilenumber.get(4));
        mobilenumber.addFirst(8);
        System.out.println("addedFV:"+mobilenumber);
        mobilenumber.addLast(0);
        System.out.println("addedLV:"+mobilenumber);
        System.out.println(mobilenumber.size());
        mobilenumber.removeLast();
        System.out.println("removedLV:"+mobilenumber);
        mobilenumber.removeFirst();
        System.out.println("removedFV:"+mobilenumber);
        System.out.println(mobilenumber.contains(9));
        mobilenumber.clear();
        System.out.println(mobilenumber);


    }
}
