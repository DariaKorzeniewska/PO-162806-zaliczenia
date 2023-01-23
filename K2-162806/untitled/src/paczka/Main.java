package paczka;
import paczka.Pojazd;
import paczka.Samochod;

public class Main {
    public static void main(String[] args) {
        Pojazd nowy = new Pojazd("Rewelacyjny",100000.0,500);
        System.out.println(nowy);
        System.out.println(Pojazd.getIle());

        Pojazd stary = new Pojazd("Niewiadomo jaki model",10000.0,600);
        System.out.println(stary);
        System.out.println(Pojazd.getIle());

        System.out.println(stary.equals(nowy));

    }
}