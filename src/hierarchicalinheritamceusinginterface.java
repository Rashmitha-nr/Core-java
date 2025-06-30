interface V{
    void Vehicle(String Vehicleno,String color);
    void Vsound(String sound);

}
interface V1 extends V{
    void CAR(String name, String color, double prize);
    void Carsound(String sound);
}
interface V2 extends V{
    void Bike(String name,double prize,int engNo);
    void Bikesound(String sound);
}
class Vechiledetails implements V1,V2{
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

public class hierarchicalinheritamceusinginterface {
    public static void main(String[] args) {
        Vechiledetails obj=new Vechiledetails();
        obj.Vehicle("KA087","Black");
        obj.Vsound("Horn");
        obj.CAR("BMW","White",4000000);
        obj.Carsound("beep");
        obj.Bike("Ktm",300000,45);
        obj.Bikesound("growl");


    }
}
