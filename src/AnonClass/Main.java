package AnonClass;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();


        Animal animal1 = new Animal(){
            public void eat(){
                System.out.println("Animal1 is eating");
            }
        };
        animal1.eat();
    }
}
