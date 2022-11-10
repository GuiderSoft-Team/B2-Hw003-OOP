package geometri;

public class MainApp {
    public static void main(String[] args) {
        Kare k1 = new Kare(9);
        Daire d1 = new Daire(5);

        System.out.println(k1);
        System.out.println(d1);
        double alanFarki = Math.abs(d1.alanHesapla() - k1.alanHesapla());
        double cevreFarki = Math.abs(d1.cevreHesapla() - k1.cevreHesapla());

        System.out.printf("Alanlar farkı: %5.2f ve Çevreler farkı: %5.2f", alanFarki, cevreFarki);
        System.out.println();
    }
}
