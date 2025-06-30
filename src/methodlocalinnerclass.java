class animaldetails{
    void dog(String name,String color){
        System.out.println(name+" "+color);
        class animaldetails2 {
            void cat(String name, String color) {
                System.out.println(name + " " + color);
            }
        }
            animaldetails2 obj2=new animaldetails2();
            obj2.cat("ora","black");
        }
    }
public class methodlocalinnerclass {
    public static void main(String[] args) {
        animaldetails obj=new animaldetails();
        obj.dog("simba","white");
    }
}
