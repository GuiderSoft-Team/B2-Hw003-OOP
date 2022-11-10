package geometri;

public class Daire {

    public int yaricap;

    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }

    public double alanHesapla(){
        return Math.PI*yaricap*yaricap;
    }
    public double cevreHesapla(){
        return Math.PI*yaricap*2;
    }
}
