abstract class Hello{        //abstract class
    abstract void greet();         //abstract method we cant create object for this abstract calss
    //if we want access this we have to create inherited class

}
class hi extends Hello{
    @Override
    void greet() {      // we have to  use same method but without abstract keyword
        System.out.println("Welcome");

    }
}

public class Abstractionexample {
    public static void main(String[] args) {
        hi obj=new hi();
        obj.greet();


    }
}
