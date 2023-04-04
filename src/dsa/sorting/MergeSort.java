package dsa.sorting;

// TC = O(nlogn) [Best]
// SC = O(n)
public class MergeSort {

    // O(n)
    private void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j<=end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= end) temp[k++] = arr[j++];

        for (int x=0; x<temp.length; x++) {
            arr[start+x] = temp[x];
        }
    }

    // O(logn)
    private void mergeSort(int arr[], int start, int end) {
        if (start == end) return;
        int mid = start + ((end-start) / 2);
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    void sort(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        mergeSort(arr, start, end);
    }
}
