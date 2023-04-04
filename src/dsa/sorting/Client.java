package dsa.sorting;

public class Client {
    private static void print(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();
    }

    private static int[] getArr() {
        return new int[]{1, 4, 5, 6, 4, 7, 4, 9};
    }

    public static void main(String[] args) {
        BasicSorter sorter = new BasicSorter();
        int[] arr = getArr();
        sorter.selectionSort(arr);
        print(arr);

        arr = getArr();
        sorter.insertionSort(arr);
        print(arr);

        arr = getArr();
        sorter.bubbleSort(arr);
        print(arr);

        arr = getArr();
        MergeSort mergeSorter = new MergeSort();
        mergeSorter.sort(arr);
        print(arr);

        arr = getArr();
        QuickSort quickSorter = new QuickSort();
        quickSorter.sort(arr);
        print(arr);
    }
}
