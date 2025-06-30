import java.util.Scanner;

class person {
    private String name="Rashmi";
    private int age=22;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class Encapsulationexample {
    public static void main(String[] args) {
        person obj=new person();
        System.out.println("Name:"+obj.getName()+" "+"Age:"+obj.getAge());

    }
}
