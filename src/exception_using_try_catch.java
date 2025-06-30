public class exception_using_try_catch {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        }
       // catch(ArrayIndexOutOfBoundsException e){
            //System.out.println("array out of bound");
        }
        //finally {
            //System.out.println("welcome");
        }


