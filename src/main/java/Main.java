import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Executable;

/**
 * Created by Дашуля on 15.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("Products"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        }catch (Exception e){e.printStackTrace();}

    }
}
