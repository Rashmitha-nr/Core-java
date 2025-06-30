class Phone{
    void mobile(){
        System.out.println("nokia");
    }
}
class phone1 extends Phone{
    void mobile() {
        super.mobile();
        System.out.println("iphone");
    }
}
public class overridingpolymorphism {
    public static void main(String[] args) {
        phone1 obj=new phone1();
        obj.mobile();//overriding different class same method samr or different parameters

    }                                            // parent class method overrides child class
}
