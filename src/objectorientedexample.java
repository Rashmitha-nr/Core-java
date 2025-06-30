import java.util.Scanner;

class Employee{
    String Emp_name="rashmi";
    String Emp_id="20211Com0008";
    double Emp_salary=100000;
}
class Department{
    int Dep_id=10;
    String Dep_name="devloper";

}
public class objectorientedexample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee obj=new Employee();
        Department obj1=new Department();
        obj.Emp_id=sc.nextLine();

        System.out.println("Employee name:"+ obj.Emp_name);
        System.out.println("Employee id:"+ obj.Emp_id);
        System.out.println("Employee salary:"+ obj.Emp_salary);
        System.out.println("Department id:"+ obj1.Dep_id);
        System.out.println("Department name:"+ obj1.Dep_name);

    }
}
