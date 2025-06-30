interface operations{
    void add(int a,int b);                 //parent interface
}
interface operation1{
    void sub(float a,float b);                //parent interface by default abstract class
}
class ArithmeticOperation implements operations,operation1{            //child class
    @Override
    public void add(int a, int b) {
        System.out.println("Addition:"+(a+b));
    }

    @Override
    public void sub(float a, float b) {
        System.out.println("Sub:"+(a-b));
    }
}
public class Multipleinheritanceusinginterface {
    public static void main(String[] args) {
        ArithmeticOperation obj=new ArithmeticOperation();
        obj.add(5,6);
        obj.sub(2.3f,1.2f);
    }
}
