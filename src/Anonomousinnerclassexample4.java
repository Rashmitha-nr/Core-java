abstract class ABC1{
    abstract void Student(String sname,String sbranch);

}
abstract class ABC2{
    abstract void employee(String ename,String role);
}
public class Anonomousinnerclassexample4 {
    public static void main(String[] args) {
        ABC1 obj = new ABC1() {
            @Override
            void Student(String sname, String sbranch) {
                System.out.println(sname+" "+sbranch);

            }
        };
        obj.Student("Rashmi", "cse");


        ABC2 obj2 = new ABC2() {
            @Override
            void employee(String ename, String role) {
                System.out.println(ename+" "+role);

            }
        };
        obj2.employee("nikitha", "developer");
    }
}

//multiple anonymous class