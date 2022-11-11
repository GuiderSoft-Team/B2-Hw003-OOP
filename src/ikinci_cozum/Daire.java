package ikinci_cozum;

public class Daire {
    public int yaricap;

    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }

    public double alanHesapla1(){
        return Math.PI*yaricap*yaricap;
    }
    public double cevreHesapla1(){
        return 2*Math.PI*yaricap;
    }
    public void bilgiGoster() {
        System.out.printf("Dairenin Alanı: %5.2f\n", alanHesapla1());
        System.out.printf("Dairenin Çevresi: %5.2f\n", cevreHesapla1());
    }
}
