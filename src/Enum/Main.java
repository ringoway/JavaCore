package Enum;

public class Main {
    public static void main(String[] args) {

        Animal animal = Animal.CAT;
        System.out.println(animal.toString());

        switch (animal){
            case CAT:
                System.out.println("It's a cat");
                break;
            case COW:
                System.out.println("It's a cow");
                break;
            case DOG:
                System.out.println("It's a dog");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
        }
        Season season = Season.SUMMER;
        System.out.println(season.getTemperature());
        switch (season){
            case SUMMER:
                System.out.println("Outside summer");
                break;
        }

        //методы из enum
        Season season1 = Season.AUTUMN;
        Animal animal1 = Animal.COW;
        System.out.println(season1.name()+" "+animal1.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

        Season autumn = Season.AUTUMN;
        System.out.println(autumn.ordinal());

    }
}
