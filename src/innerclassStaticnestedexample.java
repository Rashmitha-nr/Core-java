class outer{
    private int a=10;
    public class inner{
        public int geta(){
            return a;
        }
    }
}
public class innerclassStaticnestedexample {
    public static void main(String[] args) {
        outer obj=new outer();
        outer.inner obj2=obj.new inner();
        System.out.println(obj2.geta());


    }
}
