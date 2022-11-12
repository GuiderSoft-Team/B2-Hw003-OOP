package geometri;

public class Kare {
    int kenar;
    int cevre;
    int alan;

    public Kare(int kenar) {
        this.kenar = kenar;
        alanHesapla();
        cevreHesapla();
        System.out.println("Karenin Alanı= " + alan + "\n" + "Karenin Çevresi= " + cevre);
    }

    public int alanHesapla() {
        return alan = kenar * kenar;

    }

    public int cevreHesapla() {
        return cevre = 4 * kenar;

    }
}
