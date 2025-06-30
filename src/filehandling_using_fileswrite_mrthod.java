import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class filehandling_using_fileswrite_mrthod {
    public static void main(String[] args) {
        try{
            Files.write(Paths.get("java.text"),"hello , world!".getBytes());
            System.out.println("file created");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
