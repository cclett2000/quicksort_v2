import java.io.FileNotFoundException;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        filehandler fn = new filehandler();
        quicksort qs = new quicksort();
        int[] values = fn.getData();

        System.out.println("Array before sorting: " + Arrays.toString(values));
        qs.run(values, 0, values.length -1);
        System.out.println("Array after sorting: " + Arrays.toString(values));

    }
}
