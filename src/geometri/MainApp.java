package geometri;

public class MainApp {
    public static void main(String[] args) {
        Kare square = new Kare(9);
        Daire circle = new Daire(5);

        System.out.println(square);
        System.out.println(circle);
        double alanFarki = Math.abs(circle.alanHesapla() - square.alanHesapla());
        double cevreFarki = Math.abs(circle.cevreHesapla() - square.cevreHesapla());

        System.out.printf("Alanlar farkı: %5.2f ve Çevreler farkı: %5.2f", alanFarki, cevreFarki);
        System.out.println();
    }
}
