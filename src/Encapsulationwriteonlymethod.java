class Person{
    private String name="Rashmi";
    private int age=22;

    public void setName(String name1){
        name=name1;
    }
    public void setAge(int age1){
        age=age1;
    }
    public String getName(){
        return name;
    }
    public  int getAge(){
        return age;
    }
}
public class Encapsulationwriteonlymethod {
    public static void main(String[] args) {
        Person obj=new Person();
        obj.setName("Vishwas");
        obj.setAge(24);
        System.out.println("Name:"+obj.getName()+" "+"Age:"+obj.getAge());

    }
}
