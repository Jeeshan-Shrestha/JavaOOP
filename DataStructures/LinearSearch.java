package DataStructures;

public class LinearSearch {

    public static void main(String[] args) {

        int[] a = { 1, 5, 7, 8, 9, 12, 55, 67, 778 };
        int target = 62;
        linearSearch(a, target);

    }

    public static void linearSearch(int[] a, int target) {
        for (int i = 0; i < a.length - 1; i++) {
            if (target == a[i]) {
                System.out.println("The value was found at index: " + i);
                return;
            }
        }
        System.out.println("Target not found");
    }
}
