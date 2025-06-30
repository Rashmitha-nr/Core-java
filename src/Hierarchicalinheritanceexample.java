class Fruits{
    String Season;
    Fruits(String S){
        this.Season=S;
    }
    void Fruitsdetails(){
        System.out.println("Season:"+ (Season));
    }
}
class Apple extends Fruits{
    String color;

    Apple(String S,String color) {
        super(S);
        this.color=color;
    }
    void Appledetails(){
        super.Fruitsdetails();
        System.out.println("apple_color:" + (color));
    }
}
class Mango extends Fruits{
    double prize;
    Mango(String S,double prize){
        super(S);
        this.prize=prize;
    }
    void mangodetails(){
        super.Fruitsdetails();
        System.out.println("mango_prize:"+ (prize));
    }
}
public class Hierarchicalinheritanceexample {
    public static void main(String[] args) {
        Apple obj=new Apple("everyseason","red");
        Mango obj1=new Mango("summer",200);
        obj.Appledetails();
        obj1.mangodetails();

    }
}
