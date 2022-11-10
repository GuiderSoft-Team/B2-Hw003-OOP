package geometri;

public class Kare {
    public int kenar;

    public int alanHesapla(){
        return kenar*kenar;
    }

    public int cevreHesapla(){
        return 4*kenar;
    }

    public double kosegenUzunlugu(){
        return kenar*Math.sqrt(2);
    }

    public Kare(int kenar){

    }
}
