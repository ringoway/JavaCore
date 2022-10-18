package Enum;

public enum Season {
    WINTER(-20), SUMMER(30), AUTUMN(10), SPRING(20);

    private int temperature;
    Season(int temperature){
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }
}
