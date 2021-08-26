import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Sorts sort = new Sorts();
        int[] arr = {1,55,22,33,456,2,456,898,88,96,341,52,77,789};

        System.out.println(Arrays.toString(arr));

        sort.quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
