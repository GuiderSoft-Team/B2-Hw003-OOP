package geometri;

public class Kare {
    public int kenar;


    public  Kare(int kenar) {
        this.kenar=kenar;
    }

    public int alanHeasapla(int kenar){
        this.kenar=kenar;

        return kenar*kenar;
    }
    public int cevreHesapla(int kenar){
        this.kenar=kenar;

        return 4*kenar;
    }
    public double kosegenUzunlugu(double kenar){

        return kenar*Math.sqrt(2);
    }


}
