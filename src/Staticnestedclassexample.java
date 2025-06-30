class S{          //outer class
    static class s1{        //static class
        void show(){          //method
            System.out.println("Static class");
        }
    }
}
public class Staticnestedclassexample {
    public static void main(String[] args) {
        S.s1 obj=new S.s1(); //create object to access method in the static class this is the syntax
        obj.show();         //outerclass.staticclass=new outerclass.staticclass

    }
}
