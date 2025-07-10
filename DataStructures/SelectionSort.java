package DataStructures;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = { 2, 7, 9, 6, 4, 44, 8, 6, 4, 6, 8, 6, 4, 5, 7, 776, 87, 8, 8, 9, 9, 9, 9, 9, 22 };
        int size = a.length;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
}
