class Car1{                          //parent class
    String color;
    String model;
    Car1(String color,String model){
        this.color=color;
        this.model=model;
    }
    public void Cardetails(){
        System.out.println(color+" "+model);
    }
}
class BmW extends Car1 {                         //child class
    String fueltype;
    BmW(String color, String model,String fuletype) {
        super(color, model);
        this.fueltype=fuletype;
    }
    public void BMWdetails(){
        System.out.println(color+" "+model+" "+fueltype);

    }
}


public class singleInheritanceexample {
    public static void main(String[] args) {
        Car1 obj=new Car1("Black","2023");
        BmW obj2=new BmW("Black","2023","petrol");
        obj.Cardetails();
        obj2.BMWdetails();
      

    }
}
