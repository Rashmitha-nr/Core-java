class A{
    void show(){                                  //parent class
        System.out.println("a features");
    }
}
class B extends A{
    void show() {                                  //child class and parent class
        System.out.println("a1 features");        //parent class features
    }
    void display(){
        System.out.println("b features");           //child class features
    }

}
class C extends B{
    void show() {                                  //child class
        System.out.println("a2 features");          //parent class features
    }
    void display(){
        System.out.println("b2features");
    }
    void end(){
        System.out.println("c features");
    }


}
public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj=new C();
        obj.show();
        obj.display();
        obj.end();

    }
}
