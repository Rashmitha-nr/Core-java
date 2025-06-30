class Employee1 {
    private String emp_name = "rashmitha";
    private int emp_id = 8;
    private double emp_salary = 1000000;

    public void setEmp_name(String emp_name1) {
        emp_name = emp_name1;
    }
    public void setEmp_id(int emp_id1) {
        emp_id = emp_id1;
    }
    public void setEmp_salary(double emp_salary1) {
        emp_salary = emp_salary1;
    }
    public String getEmp_name() {
        return emp_name;
    }
    public int getEmp_id() {
        return emp_id;
    }
    public double getEmp_salary() {
        return emp_salary;
    }
}
public class employeedetailsusingencapsulation {
    public static void main(String[] args) {
        Employee1 obj = new Employee1();
        obj.setEmp_name("Rashmi");
        obj.setEmp_id(10);
        obj.setEmp_salary(50000);
        System.out.println("Name:" + obj.getEmp_name() + " " + "ID:" + obj.getEmp_id() + " " + "Salary:" + obj.getEmp_salary());

    }
}


