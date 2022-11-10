package geometri;

public class Kare {
    int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
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
