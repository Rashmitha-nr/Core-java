class operation{
    public static int add(int a,int b){
        return a+b;                                //return type
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
}
public class Staticbindingexample {
    public static void main(String[] args) {
        System.out.println(operation.add(5,6));
        System.out.println(operation.add(1,3,5));

    }
}
