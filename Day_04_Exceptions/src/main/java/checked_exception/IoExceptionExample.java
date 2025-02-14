package checked_exception;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IoExceptionExample {
    public static void main(String[] args) {
        try{
            BufferedReader reader=new BufferedReader(new FileReader("Example.txt"));
            String line;
                while((line= reader.readLine())!=null){
                    System.out.println(line);
                }
                reader.close();
        }
        catch (IOException e){
            System.err.println("File not found "+e.getMessage());
        }
    }
}
