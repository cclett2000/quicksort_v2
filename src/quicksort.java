public class quicksort {
    public void run(int[] numbers, int startIndex, int endIndex){
        quicksort(numbers, startIndex, endIndex);
    }

    private void quicksort(int[] numbers, int startIndex, int endIndex){
        // only attempt sort if > 2 elements
        if(endIndex <= startIndex){
            return;
        }

        // partition array segment
        int high = partition(numbers, startIndex, endIndex);

        quicksort(numbers, startIndex, high);               // recursively sort left segment
        quicksort(numbers, high + 1, endIndex);    // recursively sort right segment
    }

    private int partition(int[] numbers, int startIndex, int endIndex){
        // select middle val as pivot
        int midpoint = startIndex + (endIndex - startIndex) / 2;
        int pivot = numbers[midpoint];

        // low/high start at ends of array partition and move towards each other
        int low = startIndex;
        int high = endIndex;

        boolean done = false;
        while(!done){
            // increment low val while numbers[low] < pivot
            while(numbers[low] < pivot){
                low = low + 1;
            }

            // decrement high while pivot < numbers[high]
            while (pivot < numbers[high]){
                high = high - 1;
            }

            // if low/high intersect the loop is done; else, elements are swapped
            // low is incremented and high is decremented
            if (low >= high){
                done = true;
            }

            else {
                int temp = numbers[low];
                numbers[low] = numbers[high];
                numbers[high] = temp;
                low ++;
                high --;
            }
        }

        // high val is the last index in the left segment
        return high;
    }
}
