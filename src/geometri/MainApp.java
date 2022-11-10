package geometri;

public class MainApp {
    public static void main(String[] args) {
        Kare kare = new Kare(7);
        Daire daire = new Daire(7);

        System.out.printf("Karenin alan/çevre farkı : %5.2f\nDairenin alan/çevre farkı : %5.2f ",
                            Math.abs(kare.alanHesapla() - daire.alanHesapla()),
                            Math.abs(kare.cevreHesapla() - daire.cevreHesapla()));

    }
}
