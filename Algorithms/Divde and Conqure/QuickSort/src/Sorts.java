public class Sorts {
    
    public void quickSort(int[] arr, int low, int high){

        if (low < high){
            int partition = quickPartition(arr, low, high);
            // left of last partition
            quickSort(arr, low, partition - 1);
            // right of last partition
            quickSort(arr, partition + 1, high);
        }
    }

    // partition for quick sorting
    public int quickPartition(int[] arr, int low, int high){

        // only works when we pick the highest element
        // could we implement a soln that doesnt rely on
        // that to be the case eg arr[low], arr[mid]?
        int pivot = arr[high];
        int lower = low - 1;
        //int upper = low;

        for(int upper=low; upper < high; upper++){

            if (arr[upper] < pivot){
                lower++;
                int hold = arr[upper];
                arr[upper] = arr[lower];
                arr[lower] = hold;
            }
        }

        int hold = arr[lower + 1];
        arr[lower + 1] = arr[high];
        arr[high] = hold;

        return lower + 1;
    }

    // might not take all these parameters
    public void mergeSort(int[] arr, int low, int high){
        // ToDo
    }
}
