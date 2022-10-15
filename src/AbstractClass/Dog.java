package AbstractClass;

public class Dog extends Animal{
    @Override
    public void sayVoice() {
        System.out.println("Woof");
    }
    public void eat(){
        System.out.println("Dog is eating...");
    }
}
