package AnonClass;

interface AbleToEat {
    public void eat();
}
public class Main {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("someone is Eating");
            }
        };
        ableToEat.eat();
    }
}
