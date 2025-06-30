class outer1{
    public class inner1{
        void person(String name){
            System.out.println("name:"+name);
        }

    }
    public void details1(){
        inner1 obj=new inner1();
        obj.person("Rashmi");


    }
}
public class innerclassstaticnestedclassesexample1 {
    public static void main(String[] args) {
        outer1 obj1=new outer1();
        obj1.details1();


    }
}
