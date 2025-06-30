class details1{
    String Name;
    String Place;           //variables
    int Age;
    details1(String name,String place,int age){            //constructor
        Name=name;
        Place=place;
        Age=age;

    }
    public void mydetails(){
        System.out.println(Name+" "+Place+" "+Age);         //methods
    }
}
public class constructorexample2 {
    public static void main(String[] args) {
        details1 obj=new details1("Rashmitha","Bangalore",22);
        obj.mydetails();

    }
}
//for constructor, we ll pass the arguments while creating object