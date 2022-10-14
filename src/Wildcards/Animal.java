package Wildcards;

public class Animal {
    public Animal(){}
    private int id;
    public Animal(int id){
        this.id = id;
    }
    public void eat(){
        System.out.println(id+" Animal is eat");
    }

    public String toString(){
        return String.valueOf(id);
    }
}
