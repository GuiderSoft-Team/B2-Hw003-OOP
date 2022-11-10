package geometri;

public class MainApp {
    public static void main(String[] args) {
        System.out.println();
        //Lütfen readme.md dosyasına göre ödevi tamamlayınız.

        int alanHesapla = Kare.alanHesapla(7 );
        System.out.println("Karenin Alanı :"+alanHesapla);

        int cevreHesapla = Kare.cevreHesapla(7);
        System.out.println("Karenin Çevresi :"+cevreHesapla);

        double kosegenUzunlugu = Kare.kosegenUzunlugu(7);
        System.out.println("köşegen Uzunluğu :"+kosegenUzunlugu);


        double alanHesapla1 = Daire.alanHesapla(7);
        System.out.println("Dairenin Alanı :"+alanHesapla1);

        double cevreHesapla1 = Daire.cevreHesapla(7);
        System.out.println("Dairenin Çevresi :"+cevreHesapla1);

        System.out.println("Alan farkları Mutlak değer :"+Math.abs(alanHesapla-alanHesapla1));

        System.out.println("Çevre farkları Mutlak değer :"+Math.abs(cevreHesapla-cevreHesapla1));

    }

    }

