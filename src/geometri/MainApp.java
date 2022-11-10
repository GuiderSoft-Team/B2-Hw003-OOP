package geometri;

public class MainApp {
    public static void main(String[] args) {
        Kare k1= new Kare(7);
        Daire d1= new Daire(7);

        System.out.println(k1);
        System.out.println(d1);
        double farkAlan= Math.abs(d1.alanHesapla() - k1.alanHesapla());
        double farkCevre= Math.abs(d1.cevreHesapla() - k1.cevreHesapla());

        System.out.printf("Alanlar farkı: %5.2f ve Çevreler farkı: %5.2f", farkAlan, farkCevre);
        System.out.println();
    }
}
