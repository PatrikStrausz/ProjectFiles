package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> arr = new ArrayList<>();

        arr.add("kiwi");
        arr.add("banana");
        arr.add("watermelon");
        arr.add("apple");
        arr.add(2, "pineapple");
        arr.remove(2);
        arr.add("pee");
        arr.set(4, "orange");
        

        for (String temp : arr) {
            System.out.println(temp);

        }


    }
}
