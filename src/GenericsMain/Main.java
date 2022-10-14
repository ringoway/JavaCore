package GenericsMain;

import java.util.ArrayList; //ArrayList - класс
import java.util.List; //List - интерфейс

public class Main {

    public static void main(String[] args) {

        ///// до 5 версии джава /////
        List house = new ArrayList();
        house.add("Door");
        house.add("Window");
        String houseS = (String) house.get(1); //без downcasting не сработает
        // так как класс ArrayList относится к классу Object
        System.out.println(houseS);

        ///// с появлением <> (Generics) /////
        List<String> house2 = new ArrayList<String>(); //только тип стринг
        house2.add("Door");
        house2.add("Window");

        String houseS2 = house2.get(0);
        System.out.println(houseS2);

        ///// Java 7 /////
        List<String> house3 = new ArrayList<>();
    }

}
