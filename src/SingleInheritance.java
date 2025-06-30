class parent {       //parent class
    public void A() {
        System.out.println("parent features");
    }
}
class child extends parent{                        //child class
        public void A(){
            System.out.println("parent features");
        }
        public void B(){
            System.out.println("child extra features");
        }

    }


public class SingleInheritance {
    public static void main(String[] args) {
        child obj=new child();
        obj.A();
        obj.B();

    }
}
