class CAR{
    String color;
    CAR(String color){
        this.color=color;
    }
    void cardetails(){
        System.out.println("car_color:"+color);
    }
}
class BMW extends CAR{
    double prize;
    BMW(String color,double prize) {
        super(color);
        this.prize=prize;
    }
    void bmwdetails() {
        super.cardetails();
        System.out.println("BMW_color:"+color+" "+"prize:"+prize);
    }
}
class Audi extends CAR{
    double prize;

    Audi(String color,double prize) {
        super(color);
        this.prize=prize;
    }
    void audidetails() {
        System.out.println("Audi_color:"+color+" "+"prize:"+prize);
    }
}
public class Hierarchicalinheritanceexample2 {
    public static void main(String[] args) {
        BMW obj=new BMW("Black",7000000);
        Audi obj2=new Audi("Black",5000000);
        obj.bmwdetails();
        obj2.audidetails();
    }
}

