package geometri;

public class Daire {
    public double yaricap;
    public double alan;
    public double cevre;
    public Daire(double yaricap) {
        this.yaricap = yaricap;
        alanHesapla();
        cevreHesapla();
        System.out.println("Dairenin alanı = "+alanHesapla()+"\nDairenin çevresi = "+cevreHesapla());
    }
    public double alanHesapla() {
        return this.alan = Math.PI * yaricap * yaricap;

    }

    public double cevreHesapla() {
        return this.cevre = 2* Math.PI * yaricap;

    }

}
