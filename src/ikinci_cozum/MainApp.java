package ikinci_cozum;

public class MainApp {
    public static void main(String[] args) {
        Kare kare=new Kare(7);
        kare.bilgiGoster();

        Daire r=new Daire(7);
        r.bilgiGoster();

        System.out.printf("Alanların mutlak değeri: %5.2f\n",Math.abs(kare.alanHesapla()- r.alanHesapla1()));
        System.out.printf("Çevrelerin mutlak değeri: %5.2f",Math.abs(kare.cevreHesapla()- r.cevreHesapla1()));
    }
}
