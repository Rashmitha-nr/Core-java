class A5 {               //outer class
    void show() {          //outer class method
        class B5 {            //inside the outer class method we have created inner class
            public void display() {          //inner class method
                System.out.println("method local inner class");
            }
        }
        B5 obj1 = new B5(); //create object to inner class to access that method
        obj1.display();

    }
}
public class methodlocalinnerclassesexample {
    public static void main(String[] args) {
        A5 obj=new A5(); //create a object to an outer class to access that method
        obj.show();

    }
}
