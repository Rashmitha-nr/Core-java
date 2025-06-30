import java.io.FileOutputStream;

public class usingConstructor_creatingfile {
    public static void main(String[] args) {
        try(FileOutputStream op=new FileOutputStream("one.csv")) {
            System.out.println("binary file created successfully");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
