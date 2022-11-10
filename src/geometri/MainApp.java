package geometri;

public class MainApp {
    public static void main(String[] args) {

        Kare k1=new Kare(7);
        Daire d1=new Daire(7);

        double alanFark=d1.alanHesapla(7)- k1.alanHeasapla(7) ;
//        System.out.printf("Daire alan:%5.2f kare alan:%d alan mutlak deger: %5.2f\n",
//                d1.alanHesapla(7),k1.alanHeasapla(7),Math.abs(alanFark));
        double cevreFark=d1.cevreHesapla(7)- k1.cevreHesapla(7);
//        System.out.printf("Daire cevre:%5.2f kare cevre: %d cevre mutlak deger:%5.2f",d1.cevreHesapla(7)
//                ,k1.cevreHesapla(7),Math.abs(cevreFark));
        System.out.println("alan mutlak deger:"+Math.abs(alanFark));
        System.out.println();
        System.out.println("cevre mutlak deger:"+Math.abs(cevreFark));
        //Lütfen readme.md dosyasına göre ödevi tamamlayınız.
    }
}
