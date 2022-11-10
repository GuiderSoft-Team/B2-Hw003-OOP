package geometri;

public class Kare {
    private int kenar;

    public Kare(int kenar) {
        setKenar(kenar);
    }

    public Kare() {
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        if (kenar > 0) {
            this.kenar = kenar;
        }
    }

    public int alanHesapla() {
        return getKenar() * getKenar();
    }

    public int cevreHesapla() {
        return 4 * getKenar();
    }

    public double kosegenUzunlugu() {
        return getKenar() * Math.sqrt(2);
    }
}
