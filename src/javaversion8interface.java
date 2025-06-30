interface T1{
    default void demo(){
        System.out.println("demo1");
    }
}
interface T2{
    default void demo(){
        System.out.println("demo2");
    }
}
class T3{
    public void demo(){
        System.out.println("demo3");
    }
}
public class javaversion8interface extends T3 implements T2 {
    public static void main(String[] args) {
        javaversion8interface obj=new javaversion8interface();
        obj.demo();//it ll print demo3 because it ll give priority to class thn interface

    }
}
