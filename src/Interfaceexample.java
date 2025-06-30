interface fetch{
    public void display();            //by default, it is an abstract class
}
class decode implements fetch{
    @Override
    public void display() {
        System.out.println("fetch the details");
    }
}
public class Interfaceexample {
    public static void main(String[] args) {
        decode obj=new decode();
        obj.display();


    }
}
