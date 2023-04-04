package dsa.sorting;

public class BasicSorter {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Insert the current value into the correct index
    // TC = O(n^2)
    // Best case = O(n) [already sorted]
    void insertionSort(int[] arr) {
       for (int i=1; i<arr.length; i++) {
           int j = i-1;

           while (j>=0 && arr[j] > arr[j+1]) {
               swap(arr, j, j+1);
               j--;
           }
       }
    }

    // Select the best value for the current index
    // TC = O(n^2) [Best]
    void selectionSort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int index = i;

            for (int j=i; j<arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }

            swap(arr, i, index);
        }
    }

    // With every iteration, one value bubbles up to its correct spot
    // TC = O(n^2)
    // Best case = O(n) [already sorted, nothing changes in first iteration]
    void bubbleSort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            boolean someChange = false;

            for (int j=arr.length-1; j>=i+1; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                    someChange = true;
                }
            }

            if (someChange == false) break;
        }
    }
}
