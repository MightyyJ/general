public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, QuickSort!");

        int[] myArrayToSort = {1,44,5,6,77,88,333,2,3,7,8,4,888,999,9,99,233,443,222};

        System.out.println(String.valueOf(myArrayToSort));

        quickSort(myArrayToSort, 0, myArrayToSort.length);

        System.out.println(myArrayToSort);

    }

    public static void quickSort(int[] array, int low, int high){

    }
}
