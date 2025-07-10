import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

}

public class ListInterface {
    public static void main(String[] args) {

        MyComparator comparator = new MyComparator();

        List<String> arrayList = Arrays.asList("Dog", "Cats", "Mouse");

        arrayList.sort(new MyComparator());

        for (String i : arrayList) {
            System.out.print(i + " ");
        }

    }

}