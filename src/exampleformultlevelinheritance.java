class Animal1{
    String color;
    String type;
    Animal1(String color,String type){
        this.color=color;
        this.type=type;
    }
    void animaldetails(){
        System.out.println(color +" "+ type);
    }

}
class Dog2 extends Animal1{
    String name;
    Dog2(String color, String type,String name) {
        super(color, type);
        this.name=name;
    }
    void dogdetails(){
        super.animaldetails();
        System.out.println(name);
    }
}
class babydog1 extends Dog2{
    String gender;

    babydog1(String color, String type, String name,String gender) {
        super(color, type, name);
        this.gender=gender;
    }
    void babydogdetails(){
        super.animaldetails();
        System.out.println(gender);

    }
}
public class exampleformultlevelinheritance {
    public static void main(String[] args) {
        babydog obj=new babydog("black","carnivores","Simba","male");
        obj.babydogdetails();

    }
}
