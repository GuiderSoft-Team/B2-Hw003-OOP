package geometri;

public class MainApp {
    public static void main(String[] args) {
        int kareAlan = Kare.alanHesapla(7);
        System.out.println("Karenin alanı : "+kareAlan);
        int kareCevre = Kare.cevreHesapla(7);
        System.out.println("Karenin çevresi :"+kareCevre);
        double kosegenUzunlugu = Kare.kosegenUzunlugu(7);
        System.out.println("Karenin köşegen uzunluğu : "+kosegenUzunlugu);
        System.out.println();
        double daireAlan = Daire.alanHesapla(7);
        System.out.println("Dairenin alanı : "+daireAlan);
        double daireCevre = Daire.cevreHesapla(7);
        System.out.println("Dairenin çevresi : "+daireCevre);
        System.out.println();
        System.out.println("Alanların farkı : "+Math.abs(kareAlan-daireAlan));
        System.out.println("Çevrelerin farkı : "+Math.abs(kareCevre-daireCevre));
    }
}
