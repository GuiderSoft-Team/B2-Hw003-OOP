package geometri;

public class Kare {
    public int kenar;

    public Kare(int k){
        kenar=k;
    }

    public int alanHesapla(){
        return kenar*kenar;
    }
    public int cevreHesapla(){
        return 4*kenar;
    }
    public double kosegenUzunlugu(){
        return kenar*Math.sqrt(2);
    }

}
