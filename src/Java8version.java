interface R1 {
    static void display(){                     //in version 8 we can define methods inside the interface
        //in interface by default it is abstract method
        System.out.println("display");    //to5
    }
}
    /**default void demo()
    {
        System.out.println("demo");

    }

}
class demo1 implements R1{

}*/

public class Java8version {
    public static void main(String[] args) {
        R1.display();


    }
}
