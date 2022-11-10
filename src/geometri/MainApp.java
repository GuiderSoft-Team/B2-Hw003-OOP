package geometri;

public class MainApp {
    public static void main(String[] args) {
        int kareAlan=Kare.alanHesapla(7);
        int kareCevre=Kare.cevreHesapla(7);
        double kosegenUzunlugu=Kare.kosegenUzunlugu(7);

        System.out.println("Karenin Alanı: "+kareAlan);
        System.out.println("Karenin Çevresi: "+kareCevre);
        System.out.println("Köşegenin Uzunluğu: "+kosegenUzunlugu);
        System.out.println();

        double daireAlan=Daire.alanHesapla(7);
        double daireCevre=Daire.cevreHesapla(7);

        System.out.println("Dairenin Alanı: "+daireAlan);
        System.out.println("Dairenin Cevresi: "+daireCevre);

        System.out.println();

        System.out.println("AlanFarkı: "+Math.abs(kareAlan-daireAlan));
        System.out.println("ÇevreFarkı: "+Math.abs(kareCevre-daireCevre));



    }
}
