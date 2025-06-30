interface ANIMAL{
    void dog(String name,String breed,String color);
}
interface ANIMAL1{
    void cat(String name,String color);
}
class CAD implements ANIMAL,ANIMAL1{
    @Override
    public void dog(String name, String breed, String color) {
        System.out.println("Name:"+name+" "+"Breed:"+breed+" "+"Color:"+color);
    }

    @Override
    public void cat(String name, String color) {
        System.out.println("Name:"+name+" "+"Color:"+color);
    }
}

public class Multipleinheritanceusinginterface1 {
    public static void main(String[] args) {
        CAD obj=new CAD();
        obj.dog("Simba","shihtzu","white");
        obj.cat("Ora","white");

    }
}
