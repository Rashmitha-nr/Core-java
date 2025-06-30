class employeedetails{
    String Emp_Name;
    String Emp_roll;
    double Salary;
    employeedetails(String ename,String eroll,double esalary){
        Emp_Name=ename;
        Emp_roll=eroll;
        Salary=esalary;

    }
    public void mydetails(){
        System.out.println(Emp_Name+" "+Emp_roll+" "+Salary);
    }
}
public class Program {
    public static void main(String[] args) {
        employeedetails obj=new employeedetails("Rashmitha","Developer",100000);
        employeedetails obj1=new employeedetails("Nikitha","Testing",200000);
        obj.mydetails();
        obj1.mydetails();

    }
}
