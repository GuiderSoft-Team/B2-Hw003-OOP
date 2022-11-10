package geometri;

public class MainApp {
    public static void main(String[] args) {   Kare kare= new Kare(10);
        Daire daire= new Daire(7);

        System.out.println(kare);
        System.out.println(daire);
        double farkAlan= Math.abs(daire.alanHesapla() - kare.alanHesapla());
        double farkCevre= Math.abs(daire.cevreHesapla() - kare.cevreHesapla());

        System.out.printf("Alanlar farkı: %5.2f ve Çevreler farkı: %5.2f", farkAlan, farkCevre);
        System.out.println();
    }
}
