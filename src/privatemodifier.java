class private1{
    private int i=10;
    private void display(){                 //private
        System.out.println(i);
    }
    public void modifier(){                    //public but inside the class

        display();
    }
}
public class privatemodifier {
    public static void main(String[] args) {
        private1 obj=new private1();
        obj.modifier();

    } //in private access modifier whe can not access method,variable,constructor
    // ouside the class
} //if we want to access create a public method and access the
