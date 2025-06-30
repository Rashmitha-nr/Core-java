import java.nio.file.Files;
import java.nio.file.Paths;

public class Fileswriter_insert_data {
    public static void main(String[] args) {

        String content="hello";
        try{
            Files.write(Paths.get("dog.txt"),content.getBytes());
            System.out.println("inserted");

        } catch (Exception e) {
            System.out.println(e);;
        }

        }
    }

