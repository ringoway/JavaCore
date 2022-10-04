package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hi");
        list.add(303);
        System.out.println(list);

        List animals = new ArrayList();
        animals.add("frog");
        animals.add("dog");
        animals.add("bird");
    }
}

