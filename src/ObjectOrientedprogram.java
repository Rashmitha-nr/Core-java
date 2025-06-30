class Details{
    String name="Rashmi";              // create multiple objects in single class
    int age=22;                         // create multiple class in  same file

}
class Dog{
    String name="Simba";
    String breed="Shih_Tzu";
    String color="White";
}
public class ObjectOrientedprogram {
    public static void main(String[] args) {
        Details obj=new Details();
        Details obj1=new Details();
        obj1.name="Vishwas";
        obj1.age=24;

        //obj.name="R";this is another method
        System.out.println("person name:"+ obj.name );
        System.out.println("Person age:"+ obj.age);
        System.out.println("person name:"+ obj1.name );
        System.out.println("Person age:"+ obj1.age);

        Dog obj3=new Dog();
        System.out.println("Dog name:"+ obj3.name);
        System.out.println("Dog breed:"+ obj3.breed );
        System.out.println("Dog color:"+ obj3.color);




    }
}
