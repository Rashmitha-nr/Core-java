interface Details1{
    static void person(String name,int age){
        System.out.println("Name:"+name+" "+"Age:"+age);
    }
    default void person1(String name,int age){           //default method
        System.out.println("Name:"+name+" "+"Age:"+age);
    }
}
class person1details implements Details1{
    @Override
    public void person1(String name, int age) {
        Details1.super.person1(name, age);
    }   // to acess default method
}
public class defaultstaticmethodexample {
    public static void main(String[] args) {
        Details1.person("Rashmi",22);
        person1details obj=new person1details();
        obj.person1("nikitha",22);
    }
}
