import java.util.HashSet;
import java.util.Set;

public class Set1 {

    public static void main(String[] args) {

        Set<Integer> intSet = new HashSet<>();

        Set<String> stringSet = new HashSet<>();

        stringSet.add("Hello");
        stringSet.add("Hat");

        Integer myNum = 2;
        intSet.add(2);
        System.out.println(stringSet.iterator());
        System.out.println(stringSet);

    }

}