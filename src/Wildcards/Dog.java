package Wildcards;

public class Dog extends Animal{
    String name;
    public Dog(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name+" Dog is eat");
    }
}
