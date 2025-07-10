package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
        //a hashmap can have multiple values but should have unique keys
        //if there is key redundancy than the new key will overwrite the old key
        HashMap<Character,String> map = new HashMap<>();
        // put(), remove(), containsKey(), containsValue(),get(),size(),keySet()
        map.put('a' , "Apple");
        map.put('b' , "Ball" );
        map.put('c', "Cat");
        //map.remove('a');// remove takes key
        for (Character c : map.keySet())
        {
            System.out.println(c + " for " + map.get(c));
        }
    }
}
