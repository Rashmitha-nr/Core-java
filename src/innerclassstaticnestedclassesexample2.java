class outer2{
    public class inner2{
        public void person1(String name){
            System.out.println("Name:"+name);
        }
    }
}
public class innerclassstaticnestedclassesexample2 {
    public static void main(String[] args) {
        outer2 obj=new outer2();
        outer2.inner2 obj2=obj.new inner2();
            obj2.person1("rashmi");

    }
}
