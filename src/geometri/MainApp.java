package geometri;

public class MainApp {
    public static void main(String[] args) {
        System.out.println();

        Kare kare = new Kare(7);
        Daire daire = new Daire(7);
        kare.kenar=7;
        daire.yaricap=7;

        System.out.printf("Fark Alan= %5.3f",Math.abs(kare.alanHesapla()-daire.alanHesapla()));
        System.out.println();
        System.out.printf("Fark Çevre= %5.3f",Math.abs(kare.cevreHesapla()-daire.cevreHesapla()));
    }
}

