interface A2 {
    static void show() {                          //static method
        System.out.println("Static method");
    }

    default void display() {                         //default method
        System.out.println("default method");
    }
}
class demo implements A2{
    @Override
    public void display() {
        A2.super.display();
    }
}
public class staticanddefaultmethod {
    public static void main(String[] args) {
        A2.show();
        demo obj=new demo();
        obj.display();

    }
}
