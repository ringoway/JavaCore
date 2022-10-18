package Serializable3;

import java.io.Serializable;

public class PersoN implements Serializable {

    private int id; //при использовании transient на примитивах
    // будет выдавать значение 0, у строчных (String) будет ссылаться
    // на null
    //serialVersionUID
    private transient String name;


    public PersoN(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return id+" : "+name;
    }
}
