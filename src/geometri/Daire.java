package geometri;

public class Daire {
    int r;

    public Daire(int b){
        r=b;
    }
    public double alanHesapla(){
        return Math.PI*r*r;
    }
    public double cevreHesepla(){
        return 2*Math.PI*r;

    }

}
