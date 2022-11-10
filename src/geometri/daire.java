package geometri;

public class daire {

    public int yaricap;


    public double alanHesapla(){
        return Math.PI*yaricap*yaricap;
    }

    public double cevreHesapla(){
        return 2*Math.PI*yaricap;
    }

    public daire(int yaricap) {
        this.yaricap = yaricap;
    }
}
