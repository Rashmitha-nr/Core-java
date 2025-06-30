class Details5{             //outer class
    void information(){         //method for outer class
        class information1{
            public void person(String name,int age){
                System.out.println(name+" "+age);
            }
            public void dog(String name,String color){
                System.out.println(name+" "+color);
            }

        }
        information1 obj1=new information1();
        obj1.person("rashmi",22);
        obj1.dog("simba","black");
    }
}
public class methodlocalinnerclassexample1 {
    public static void main(String[] args) {
        Details5 obj=new Details5();
        obj.information();

    }
}
