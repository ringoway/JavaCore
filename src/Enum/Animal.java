package Enum;

public enum Animal {
    FROG("лягушка"), CAT("Кошка"), DOG("Собака"), COW("Корова");
    private String translation;

    Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
    public String toString(){
        return "Перевод на русский язык: "+translation;
    }
}
