interface Vehicle1{
    void Vehicle(String Vehicleno,String color);
    void Vsound(String sound);
}
interface CAR1 extends Vehicle1{
    void CAR(String name, String color, double prize);
    void Carsound(String sound);
}
interface BIKE extends CAR1{
    void Bike(String name,double prize,int engNo);
    void Bikesound(String sound);
}
class Vechiledetails1 implements BIKE{
    @Override
    public void CAR(String name, String color, double prize) {
        System.out.println("Name:"+name+" "+"Color:"+color+" "+"Prize:"+prize);
    }

    @Override
    public void Carsound(String sound) {
        System.out.println("Sound:"+sound);
    }

    @Override
    public void Bike(String name, double prize, int engNo) {
        System.out.println("Name:"+name+" "+"prize:"+prize+" "+"No:"+engNo);
    }

    @Override
    public void Bikesound(String sound) {
        System.out.println("Sound:"+sound);

    }

    @Override
    public void Vehicle(String Vehicleno, String color) {
        System.out.println("Vehicle_No:"+Vehicleno+" "+"Color:"+color);
    }

    @Override
    public void Vsound(String sound) {
        System.out.println("Sound:"+sound);
    }
}
public class Multilevelinheritanceusinginterface {
    public static void main(String[] args) {
        Vechiledetails1 obj=new Vechiledetails1();
        obj.Vehicle("KA087","Black");
        obj.Vsound("Horn");
        obj.CAR("BMW","White",7000000);
        obj.Carsound("beep");
        obj.Bike("Ktm",300000,45);
        obj.Bikesound("growl");


    }
}
