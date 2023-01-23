package paczka;
import paczka.Pojazd;

import java.time.LocalDate;
import java.util.Calendar;

public class Samochod extends Pojazd{
    private String rodzajPaliwa;
    private LocalDate dataProdukcji;

    public Samochod(String model, double cena, double waga, String rodzajPaliwa, int rok, int miesiac, int dzien){
        super(model, cena, waga);
        this.rodzajPaliwa = rodzajPaliwa;
        this.dataProdukcji = LocalDate.of(rok,miesiac,dzien);
    }

    public Samochod(String model, double cena, double waga, String rodzajPaliwa){
        this(model,cena,waga,rodzajPaliwa,Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH);
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }

    public void setDataProdukcji(int rok, int miesiac, int dzien) {
        this.dataProdukcji = LocalDate.of(rok,miesiac,dzien);
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + this.getClass().getName() + " " + this.rodzajPaliwa + " " + getDataProdukcji();
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Samochod)){
            return false;
        }
        boolean dataEquals = false;
        if(this.dataProdukcji.isEqual(((Samochod) o).dataProdukcji)){
            dataEquals = true;
        }
        boolean rodzajEquals = false;
        int count = 0;
        for(int i=0; i<this.rodzajPaliwa.length(); i++){
            if(this.rodzajPaliwa.charAt(i) == ((Samochod) o).rodzajPaliwa.charAt(i)){
                count+=1;
            }
        }
        if(count == ((Samochod) o).rodzajPaliwa.length()){
            rodzajEquals = true;
        }
        return super.equals(o) && rodzajEquals && dataEquals;
    }
}
