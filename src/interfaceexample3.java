interface College{
    public void Btech(String name,int noofyear,float cgpa);
    public void Pu(String name,int noofyear,float percentage );
    public void tenth(String name,int noofyear,float percentage);

}
class college1 implements College{
    @Override
    public void Btech(String name, int noofyear, float cgpa) {
        System.out.println("Name:"+name+" "+"No_of_year:"+noofyear+" "+"CGPA:"+cgpa);

    }

    @Override
    public void Pu(String name, int noofyear, float percentage) {
        System.out.println("Name:"+name+" "+"No_of_year:"+noofyear+" "+"Percentage:"+percentage);

    }

    @Override
    public void tenth(String name, int noofyear, float percentage) {
        System.out.println("Name:"+name+" "+"No_of_year:"+noofyear+" "+"Percentage:"+percentage);

    }
}
public class interfaceexample3 {
    public static void main(String[] args) {
        college1 obj=new college1();
        obj.Btech("Presidency_university",4,8.6f);
        obj.Pu("maruthi_pu_college",2,87.66f);
        obj.tenth("Citizens_high_school",10,86.72f);

    }
}
