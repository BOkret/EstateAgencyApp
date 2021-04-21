import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        dataReader.readFile();
        dataReader.readText();                      //checks which lines were read by app

        Arrays.sort(dataReader.properties);         //sorts properties in increasing order by cost per square meter
        System.out.println("Available properties:");
        dataReader.readText();
    }
}
