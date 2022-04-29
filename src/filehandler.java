import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class filehandler {
    public int[] getData() throws FileNotFoundException {
        return fillArray();
    }

    private int[] fillArray() throws FileNotFoundException {
        int[] data = new int[100];
        File inputFile = new File("sample_100.txt");
        Scanner reader = new Scanner(inputFile);

        int i = 0;
        while (reader.hasNextLine()) {
            data[i] = Integer.parseInt(reader.next());
            i++;
        }

        return data;
    }
}
