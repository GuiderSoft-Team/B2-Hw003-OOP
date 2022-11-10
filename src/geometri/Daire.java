package geometri;

 public class Daire {
    public int yaricap;

    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }

    public double alanHesapla(){
        return Math.round(Math.PI * yaricap * yaricap);

    }
    public double cevreHesapla() {
        return Math.round(2 * Math.PI * yaricap);
    }
    public String toString(){
        return "Daire[yarıçapı=" + this.yaricap + " Alanı= " + alanHesapla() + " Çevresi= " + cevreHesapla() + "]";
    }
}