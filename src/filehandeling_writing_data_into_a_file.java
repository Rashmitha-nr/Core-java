import java.io.FileWriter;

public class filehandeling_writing_data_into_a_file  {
    public static void main(String[] args) throws Exception{
        FileWriter writer=new FileWriter("abc.txt");
        writer.write("I am Rashmitha");
        System.out.println("data inserted successfully");
        writer.close();
    }
}
