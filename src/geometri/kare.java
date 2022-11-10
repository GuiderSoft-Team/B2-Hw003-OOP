package geometri;

public class kare {

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

    public kare(int kenar) {
        this.kenar = kenar;
    }
}
