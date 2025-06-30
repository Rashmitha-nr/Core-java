class outerclass{                          //outerclass
    private class innerclass {               //private inner calss
        void demo() {
            System.out.println("private inner class");
        }
    }
        void display(){
            innerclass obj=new innerclass();  //create object for inner class
            obj.demo();

        }
    }

public class staticinnerclassexample {
    public static void main(String[] args) {
        outerclass obj1=new outerclass();  //create object for outer class
        obj1.display();

    }
}
