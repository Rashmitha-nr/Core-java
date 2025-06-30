class DETAILS{
    private class Personinformation{
        public void Person(String name,int age){
            System.out.println(name+" "+age);

        }
    }
    public void Persondetails(){
        Personinformation obj=new Personinformation();
        obj.Person("Rashmi",22);
    }
}
public class staticinnerclassexample1 {
    public static void main(String[] args) {
        DETAILS obj1=new DETAILS();
        obj1.Persondetails();


    }

}
