package geometri;

import java.sql.SQLOutput;

public class MainApp   {
    public static void main(String[] args) {
        System.out.println();

        int alanHesapla = Kare.alanHesapla(7);
        System.out.println("Karenin alanı: "+alanHesapla);

        int cevreHesapla=Kare.cevreHesapla(7);
        System.out.println("Karenin cevresi:"+cevreHesapla);

        double kosegenUzunlugu = Kare.kosegenUzunlugu(7);
        System.out.println("KosegenzUzunlugu="+kosegenUzunlugu);

        double alanHesapla1 = Daire.alanHesapla(7);
        System.out.println("Dairenin alanı:"+alanHesapla1);

        double cevreHesapla1 = Daire.cevreHesapla(7);
        System.out.println("Cevre hesapla:"+cevreHesapla1);

        System.out.println("Alanların mutlak degeri:"+Math.abs(alanHesapla-alanHesapla1));
        System.out.println("Cevrelerin mutlak degeri:"+Math.abs(cevreHesapla-cevreHesapla1));


    }
}
