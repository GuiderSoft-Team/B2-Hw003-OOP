package geometri;

public class MainApp {
    public static void main(String[] args) {
        System.out.println();
        //Lütfen readme.md dosyasına göre ödevi tamamlayınız.

        Kare k1=new Kare(9);
        Daire d1=new Daire(8);

        k1.alanHesapla();
        k1.cevreHesapla();
        k1.kosegenUzunlugu();
        d1.alanHesapla();

        k1.bilgiler();

    }

}
