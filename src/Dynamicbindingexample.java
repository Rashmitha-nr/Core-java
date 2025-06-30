class addition{
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class O extends addition{
    @Override
    public void add(int a, int b) {
        super.add(a, b);
    }
}
public class Dynamicbindingexample {
    public static void main(String[] args) {
        addition obj=new O();             //dynamic binding
        obj.add(4,5);       //instead of creating  object for parent clASS OR CHILD CLASS wec can refer child class from parent class

    }
}
