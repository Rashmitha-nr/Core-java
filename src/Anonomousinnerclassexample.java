abstract class A7{            //abstract class
    public abstract void show();             //abstract method

    }

public class Anonomousinnerclassexample {
    public static void main(String[] args) {
        A7 obj=new A7() {        //anonomous

            @Override
            public void show() {
                System.out.println("Anonomous class");
            }
        };
        obj.show();

    }
}
