class dog{
    String color;
    dog(String color){
        this.color=color;
    }
    void dogdetails(){
        System.out.println("dog_color:"+color);
    }
}
class Babydog extends dog{
    String name;
    int age;
    Babydog(String color, String name, int age) {
        super(color);
        this.name=name;
        this.age=age;
    }
    void babydogdetails(){
        System.out.println("dog_color:"+color+" "+"dog_name:"+name+" "+"dog_age:"+age);
    }
}
public class SingleInheritanceexample1 {
    public static void main(String[] args) {
        Babydog obj=new Babydog("Black","simba",3);
        obj.dogdetails();
        obj.babydogdetails();

    }
}
