package DataStructures;

public class BinarySearch {

    int[] a = { 1, 2, 5, 6, 5, 7, 8, 5, 34, 6, 43, 5, 4, 454, 45, 4, 5 };

    public void main(String[] args) {
        int target = 7;
        bubbleSort(a, a.length);
        // for (int i = 0; i < a.length - 1; i++) {
        // System.out.println(a[i]);
        // }

        int first = 0;
        int last = a.length;

        while (first <= last) {
            int middle = (first + last) / 2;
            if (a[middle] == target) {
                System.out.println("The number is found at index " + middle);
                return;
            } else if (a[middle] > target) {
                last = middle;
            } else {
                first = middle;
            }
        }
        System.out.println("Not found");

    }

    public static void bubbleSort(int[] a, int size) {
        int temp = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
