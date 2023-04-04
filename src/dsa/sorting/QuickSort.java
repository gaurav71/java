package dsa.sorting;

// TC = O(nlogn)
// Worst Case = O(n^2) [already sorted, reverse sorted]
// SC = O(n^2)
public class QuickSort {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    private void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int k = start;

        for (int i=start; i<end; i++) {
            if (arr[i] < arr[end]) {
                swap(arr, i, k++);
            }
        }

        swap(arr, k, end);
        quickSort(arr, start, k-1);
        quickSort(arr, k+1, end);
    }

    void sort(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        quickSort(arr, start, end);
    }
}
