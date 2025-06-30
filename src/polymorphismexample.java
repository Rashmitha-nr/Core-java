class Addition{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

}
public class polymorphismexample {
    public static void main(String[] args) {
        Addition obj=new Addition();
        obj.add(5,6);
        obj.add(4,5,4);


    }
}
