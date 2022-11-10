package geometri;

public class MainApp {
    public static void main(String[] args) {
        System.out.println();
        //Lütfen readme.md dosyasına göre ödevi tamamlayınız.
        Kare k1=new Kare(7);
        Daire d1=new Daire(7);
        double alanFark= d1.alanHesapla()- k1.alanHesapla();
        double cevreFarki= d1.cevreHesapla()-k1.cevreHesapla();
        System.out.printf("Kare ve Dairenin Alan farki  : |%5.1f|",Math.abs(alanFark));
        System.out.println();
        System.out.printf("Kare ve Dairenin Cevre farki : %5.1f",Math.abs(cevreFarki));

    }
}
