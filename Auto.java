package lab4;

import java.util.ArrayList;

public class Auto {
    public String nazwa;
    public String kolor;
    public int rokProdukcji;
    public int id;

    public Auto(){
        this.nazwa = "";
        this.kolor = "";
        this.rokProdukcji = 0;
        this.id = 0;
    }

    public Auto(String nazwa, String kolor, int rokProdukcji, int id){
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.id = id;
    }
    @Override
    public String toString(){
        return "Id: "+ this.id +", Model: " + this.nazwa + ", Kolor: " + this.kolor + ", Rok produkcji: " + this.rokProdukcji;
    }
}
