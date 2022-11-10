package geometri;

public class MainApp {
    public static void main(String[] args) {
        Kare kare=new Kare(7);
        Daire daire=new Daire(7);
        kare.kenar=7;
        daire.yaricap=7;

        System.out.printf("Alanlar Farkı= %5.2f\n",Math.abs(kare.alanHesapla()-daire.alanHesapla()));
        System.out.printf("Çevreler Farkı= %5.2f",Math.abs(kare.cevreHesapla()-daire.cevreHesapla()));
    }
}