class A1{
    void show(){
        System.out.println("a features"); //parent class
    }
}
class B1 extends A1{
    void show(){
        System.out.println("a features"); //child class
    }
    void display(){
        System.out.println("b features");
    }
}
class C1 extends A1{
    void show(){
        System.out.println("a features"); //child class
    }
    void end(){
        System.out.println("c features");
    }
}

public class Hierarchicalinheritance {
    public static void main(String[] args) {
        B1 obj=new B1();
        obj.show();
        obj.display();
        C1 obj1=new C1();
        obj1.show();
        obj1.end();

    }
}
