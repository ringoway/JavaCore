package NestedClasses;

public class Electrocar {
    private int id;
    private static int test; //статик класс = статик поле

    //вложенный нестатический класс
    //обычно private
    private class Motor{
        public void startMotor(){
            System.out.println("Motor " +id+" is starting...");
            }
        }
    //вложенный статический класс
    //обычно public + static. Не имеет доступа к полям объекта класса (id)
    public static class Battery{
    public void charge(){
        System.out.println("Battery is charging..."+test);
    }
}

    public Electrocar(int id){
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar "+id+" is starting...");

        final int x=43;

        class SomeClass{
            public void SomeMethod(){
                System.out.println("test "+x+" "+id);
            }
        }
        SomeClass someObject = new SomeClass();
        test(someObject);
        someObject.SomeMethod();
    }
    public void test(Object obj){

    }
}
/*
1. Нестатический вложенный класс - применяется когда можно разделить класс
на подобъекты.
2. Статический вложенный класс
3. Класс вложенный в метод
*/
