package geometri;

public class MainApp {
    public static void main(String[] args) {
        System.out.println();
        //Lütfen readme.md dosyasına göre ödevi tamamlayınız.

        kare k1 = new kare(7);

        daire yaricap=new daire(7);

        double alanFark;
        double cevreFark;

        alanFark=Math.abs(k1.alanHesapla()- yaricap.alanHesapla());
        cevreFark=Math.abs(k1.cevreHesapla()- yaricap.cevreHesapla());

        System.out.printf("Alan fark: " +alanFark);
        System.out.printf("Çevre fark: " +cevreFark);




    }
}
