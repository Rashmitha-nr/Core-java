import java.util.List;
import java.util.Vector;

public class vectorsex {
    public static void main(String[] args) {
        List<String> department=new Vector<>();
        department.add("COM");
        department.add("Ece");
        department.add(2,"Cse");
        System.out.println(department);
        System.out.println("size:"+department.size());
        department.addFirst("mech");
        System.out.println("AddedFV:"+department);
        department.addLast("Cvil");
        System.out.println("AddedLV:"+department);
        department.removeFirst();
        System.out.println("removedFV:"+department);
        department.removeLast();
        System.out.println("removedLV:"+department);
        System.out.println("getvalue:"+department.get(1));
        System.out.println(department.contains("Mech"));
        department.clear();
        System.out.println(department);

    }
}
