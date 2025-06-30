interface animal5{
    public void dog(String name,String breed,String color);
    public void cat(String name,String color);

}
class animal2 implements animal5{
    @Override
    public void dog(String name, String breed, String color) {
        System.out.println("Name:"+name+" "+"Breed:"+breed+" "+"Color:"+color);
    }

    @Override
    public void cat(String name, String color) {
        System.out.println("Name:"+name+" "+"Color:"+color);
    }
}
public class interfaceexample1 {
    public static void main(String[] args) {
        animal2 obj=new animal2();
        obj.dog("simba","shihtzu","whilte");
        obj.cat("Orange","white");


    }
}
