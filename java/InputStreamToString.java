import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamToString{
    public static String inputStreamToString(InputStream input) throws IOException{
        StringBuilder builder = new StringBuilder();
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null){
            builder.append(line);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        try {
            InputStream input = new ByteArrayInputStream("hello world".getBytes());
            String strFromInpStream = inputStreamToString(input);
            System.out.print("String from the Input Stream is: " + strFromInpStream);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.print(e);
        }
    }
}