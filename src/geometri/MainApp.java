package geometri;

public class MainApp {
    public static void main(String[] args) {

        Kare square = new Kare(7);

        Daire circle = new Daire(7);

        System.out.println("Karenin alan ve çevre faarkı : "
                + Math.abs(square.alanHesapla() - square.cevreHesapla()));

        System.out.println("Dairenin alan ve çevre farkı : "
                + Math.abs(circle.alanHesapla() - circle.cevreHesapla()));

    }
}
