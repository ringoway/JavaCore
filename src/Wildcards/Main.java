package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listAnimals = new ArrayList<>();
        listAnimals.add(new Animal(1));
        listAnimals.add(new Animal(2));

        List<Dog> listDog = new ArrayList<>();
        listDog.add(new Dog("Micke"));
        listDog.add(new Dog("Larry"));

        test(listAnimals);
        test(listDog);

    }
    private static void test(List<? extends Animal>list){ // ? - Wildcard
        for(Animal animal : list){
            animal.eat();
        }
    }
}
