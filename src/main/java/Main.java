import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.lang.reflect.Executable;
import java.util.ArrayList;

/**
 * Created by Дашуля on 15.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("Products"))) {
            String line = br.readLine();
            ArrayList<Product> myList = new ArrayList<>();
            while (line != null) {
                String[] mass = line.split(";");
                Product prod = new Product();
                prod.setName(mass[0]);
                prod.setCategory(mass[1]);
                prod.setFixedPrice(Integer.parseInt(mass[2]));
                prod.setSummaryPrice(Integer.parseInt(mass[3]));
                myList.add(prod);
                line = br.readLine();
            }
            System.out.println(myList);
        }catch (Exception e){e.printStackTrace();}

    }
}
