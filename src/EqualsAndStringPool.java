public class EqualsAndStringPool {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Animal animal1 = new Animal(1);

        System.out.println(animal.equals(animal1));

        String str1 = "Hello"; //String Pool - пул всех строк в джаве
        String str2 = "Hello"; //две ссылки str1 и str2 на один объект "Hello"
        //если нужно два разных объекта с одинаковым текстом то:
        String str3 = new String("Hello");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3)); //тут без переопределенного метода
        // equals выдало бы false

        System.out.println(str1==str3); //это другое

    }
}
class Animal {
    private int id;

    public Animal(int id){
        this.id = id;
    }
    public boolean equals(Object obj){
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
