import java.io.*;

public class DataReader {
    private final String fileName = "data1.txt";
    private final int NUMBER_OF_LINES = 10;

    public Property[] properties = new Property[NUMBER_OF_LINES];

    void readFile() {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
        ) {
            String readLine;
            int i = 0;
            reader.readLine();                                  //avoids first line with headings
            while ((readLine = reader.readLine()) != null){
                String[] tab = readLine.split(";");
                properties[i] = new Property(tab[0], Double.valueOf(tab[1]), Double.valueOf(tab[2]));
                i++;
            }
            System.out.println("File loaded");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("File does not exist");
        }
    }

    void readText(){
        for (Property property : properties) {
            System.out.println(property);
        }
    }

}
