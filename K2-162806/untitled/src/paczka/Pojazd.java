package paczka;

public class Pojazd {
    private String model;
    private double cena;
    private double waga;
    private static int ile;

    public Pojazd(String model, double cena, double waga){
        this.model = model;
        this.cena = cena;
        this.waga = waga;
        ile+=1;
    }

    public Pojazd(double cena, double waga){
        this("Niewiadomo jaki model", cena, waga);
    }

    public String getModel() {
        return model;
    }

    public double getCena() {
        return cena;
    }

    public double getWaga() {
        return waga;
    }

    public static int getIle() {
        return ile;
    }

    @Override
    public String toString(){
        if (this.model == "Niewiadomo jaki model"){
            return this.getClass().getName() + " [ "  + ", " + getCena() + ", " + getWaga() +  " ]";
        }
        return this.getClass().getName() + " [ " + getModel() + ", " + getCena() + ", " + getWaga() +  " ]";
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Pojazd)){
            return false;
        }
        boolean cenaEquals = false;
        if(this.cena == ((Pojazd) o).cena){
            cenaEquals = true;
        }
        boolean wagaEquals = false;
        if(this.waga == ((Pojazd) o).cena){
            wagaEquals = true;
        }

        return this.model.equals(((Pojazd) o).model) && cenaEquals && wagaEquals;
    }

    public void zwiekszCene(double procent){
        this.cena = this.cena + this.cena*procent;
    }

}
