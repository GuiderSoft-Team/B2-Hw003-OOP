package geometri;

public class MainApp {
    public static void main(String[] args) {
        System.out.println();
        //Lütfen readme.md dosyasına göre ödevi tamamlayınız.

        Kare kare = new Kare(7);
        Daire daire = new Daire(7);
        System.out.printf("Kösegen Uzunlugu = %5.2f\n", kare.kosegenUzunlugu());
        System.out.println("==========================");
        System.out.printf("Alanlar farki = %5.2f\n", Math.abs(kare.alanHesapla() - daire.alanHesapla()));
        System.out.printf("Cevreler farki = %5.2f\n", Math.abs(kare.cevreHesapla() - daire.cevreHesapla()));
    }
}
