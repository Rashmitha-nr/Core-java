import java.util.ArrayList;
import java.util.List;

public class Listexample {
    public static void main(String[] args) {
        /***List<Integer> arraylist=new ArrayList<>();
        arraylist.add(30);
        arraylist.add(40);
        arraylist.add(60);
        arraylist.add(50);
        System.out.println(arraylist);
        arraylist.add(1,80);
        System.out.println(arraylist.size());
        System.out.println(arraylist);
        System.out.println(arraylist.get(1));
        arraylist.remove(3);
        System.out.println(arraylist);
        //contain method is to check whether the element is available in the list or not print boolean values
        System.out.println(arraylist.contains(60));*/
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("orange");
        System.out.println(fruits);
        fruits.add(1,"watermelon");//add the element particular index remaining ll be same
        System.out.println("added:"+fruits);
        fruits.set(2,"pineapple");
        System.out.println("set:"+fruits);//this method ll replace with that index value
        System.out.println(fruits.size());
        fruits.remove(3);
        System.out.println("remove:"+fruits);
        System.out.println(fruits.contains("Mango"));
    }
}
