package geometri;

public class MainApp {
    public static void main(String[] args) {
        Kare kare=new Kare(7);
        Daire daire=new Daire(7);

        System.out.printf("Alan Farkı:%5.2f\n",Math.abs(kare.alanHesapla()-daire.alanHesapla()));
        System.out.printf("Çevre Farkı:%5.2f",Math.abs(kare.cevreHesapla()- daire.cevreHesapla()));
    }
}
