class Animal{
    String color;
    String type;
    Animal(String color,String type){
        this.color=color;
        this.type=type;
    }
    void animaldetails(){
        System.out.println(color+" "+type);
    }

}
class Dog1 extends Animal{
    String name;
    Dog1(String color, String type,String name) {
        super(color, type);
        this.name=name;
    }
    void dogdetails(){
        System.out.println(color+" "+type+" "+name);
    }
}
class babydog extends Dog1{
    String gender;

    babydog(String color, String type, String name,String gender) {
        super(color, type, name);
        this.gender=gender;
    }
    void babydogdetails(){
        System.out.println(color+" "+type+" "+name+" "+gender);

    }
}
public class MultiLevelInheritanceexample {
    public static void main(String[] args) {
        babydog obj=new babydog("black","carnivores","Simba","male");
        obj.babydogdetails();

    }
}
