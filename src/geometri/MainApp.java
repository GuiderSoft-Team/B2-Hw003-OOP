package geometri;

public class MainApp {
    public static void main(String[] args) {
        int kareninAlan=Kare.alanHesapla(7);
        System.out.println("Karenin Alanı : "+kareninAlan);
        int kareninCevre=Kare.cevreHesapla(7);
        System.out.println("Karenin Çevresi :"+kareninCevre);
        double kosegeninUzunlugu=Kare.kosegenUzunlugu(7);
        System.out.println("Köşegenin Uzunluğu : "+Kare.kosegenUzunlugu(7));
        System.out.println();
        double daireninAlan=Daire.alanHesapla(7);
        System.out.println("Dairenin Alanı : "+daireninAlan);
        double daireninCevre=Daire.cevreHesapla(7);
        System.out.println("Dairenin Çevresi : "+daireninCevre);
        System.out.println("Alanlarının Farkı : "+Math.abs(kareninAlan-daireninAlan));
        System.out.println("Çevrelerinin Farkı :"+Math.abs(kareninCevre-daireninCevre));


    }
}
