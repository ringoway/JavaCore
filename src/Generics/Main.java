package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // раньше
        List list = new ArrayList();
        list.add("hi");
        list.add(303);
        System.out.println(list);

        List animals = new ArrayList();
        animals.add("frog");
        animals.add("dog");
        animals.add("bird");
        System.out.println(animals);

        // после появления дженериков
        List<String> animals2 = new ArrayList<String>();
        animals2.add("frog");
        animals2.add("dog");
        animals2.add("bird");
        System.out.println(animals2);

    }
}

