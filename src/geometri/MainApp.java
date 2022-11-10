package geometri;

public class MainApp {
    public static void main(String[] args) {
        System.out.println();
        //Lütfen readme.md dosyasına göre ödevi tamamlayınız.
        Kare kare1 = new Kare(7);
        Daire daire1 = new Daire(7);
        System.out.printf("Alanlarin farki = %5.2f\n",Math.abs(kare1.alanHesapla()- daire1.alanHesapla()));
        System.out.printf("Cevre uzunluklarin farki = %5.2f",Math.abs(kare1.cevreHesapla()- daire1.cevreHesapla()));
    }
}
