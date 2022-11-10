package geometri;

public class Kare {
    public int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

    public int alanHesapla() {
        return this.kenar * this.kenar;

    }

    public int cevreHesapla() {
        return 4 * this.kenar;
    }

    public double kosegenHesapla() {
        return kenar * Math.sqrt(2);
    }

    public String toString() {
        return "Kare kenarı=" + this.kenar + " Alanı= " + alanHesapla() + " Çevresi= " + cevreHesapla()+ " Köşegen uzunluğu= " + kosegenHesapla();
    }

}