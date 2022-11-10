package geometri;

public class Kare {

    int kenar;

    public Kare(int a){
        this.kenar=a;
    }
    public int alanHesapla(){
        return kenar*kenar;
    }
    public int cevreHesapla(){
        return 4*kenar;
    }
    public double kosegenHesapla(){
        return kenar*Math.sqrt(2);
    }


}
