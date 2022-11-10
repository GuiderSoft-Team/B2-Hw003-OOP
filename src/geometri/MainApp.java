package geometri;

public class MainApp {
    public static void main(String[] args) {
        System.out.println();
        //Lütfen readme.md dosyasına göre ödevi tamamlayınız.

        int kareninAlani=Kare.alanHesapla(7);
        System.out.println("Karenin Alanı: "+kareninAlani);

        int kareninCevresi=Kare.cevreHesapla(7);
        System.out.println("Karenin Cevresi: "+kareninCevresi);

        double kosegenUzunlugu=Kare.kosegenUzunlugu(7);
        System.out.printf("Köşegenin Uzunluğu: %5.2f\n ",kosegenUzunlugu);
        System.out.println();

        double daireninAlani=Daire.alanHesapla(7);
        System.out.printf("Dairenin Alanı: %5.2f\n",daireninAlani);

        double daireninCevresi=Daire.cevreHesapla(7);
        System.out.printf("Dairenin Cevresi: %5.2f\n ",daireninCevresi);
        System.out.println();


        System.out.printf("Alanlar Farkkı: %5.2f\n",Math.abs(kareninAlani-daireninAlani));
        System.out.printf("Çevreler Farkkı: %5.2f\n",Math.abs(kareninCevresi-daireninCevresi));


    }

}
