abstract class animal{
    public abstract void Dog(String name,String color);
    public abstract void cat(String name,String color);

}
public class Anonomousinnerclassesexample3 {
    public static void main(String[] args) {
        animal obj=new animal() {
            @Override
            public void Dog(String name, String color) {
                System.out.println(name+" "+color);
            }

            @Override
            public void cat(String name, String color) {
                System.out.println(name+" "+color);

            }
        };
        obj.Dog("Simba","white");
        obj.cat("ora","black");

    }
}
