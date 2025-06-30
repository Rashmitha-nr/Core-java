class Car{
    String Car_Name;
    String Car_Model;
    String Car_Color;
    double Car_Prize;

    Car(String Car_name,String Car_model,String Car_color,double Car_prize){
        Car_Name=Car_name;
        Car_Model=Car_model;
        Car_Color=Car_color;
        Car_Prize=Car_prize;

    }
    public void Car_details(){
        System.out.println("Car Name:"+Car_Name+" "+"Car Model:"+Car_Model+" "+"Car color:"+Car_Color+" "+"Car Prize:"+Car_Prize+" ");
    }
}
public class Program1 {
    public static void main(String[] args) {
        Car obj=new Car("Toyota","Fortuner","Black",4500000);
        Car obj2=new Car("Hundai","Create Sx","white",0);
        obj.Car_details();
        obj2.Car_details();


    }
}
