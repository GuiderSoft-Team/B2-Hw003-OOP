package geometri;

public class Daire {
    private int yaricap;

    public Daire(int yaricap) {
        setYaricap(yaricap);
    }

    public Daire() {
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        if (yaricap > 0) {
            this.yaricap = yaricap;
        }
    }

    public double alanHesapla() {
        return getYaricap() * getYaricap() * Math.PI;
    }

    public double cevreHesapla() {
        return 2 * Math.PI * getYaricap();
    }
}
