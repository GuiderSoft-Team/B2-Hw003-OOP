package geometri;

public class Daire {
    public int yaricap;
    public Daire(int yaricap){
    }

    public double alanHesapla(){
        return Math.PI*yaricap*yaricap;
    }

    public double cevreHesapla(){
        return 2*Math.PI*yaricap;
    }
}
