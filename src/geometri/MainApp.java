package geometri;

public class MainApp {
    public static void main(String[] args) {
        System.out.println();
int kareAlan=Kare.alanHesapla(7);
int kareCevre=Kare.cevreHesapla(7);
double kareKose=Kare.kosegenUzunlugu(7);
double cevreAlan=Cevre.alanHesapla(7);
double cevreCevre=Cevre.cevreHesapla(7);

        System.out.println("Karenin Alani = "+kareAlan);
        System.out.println("Karenin Cevresi = "+kareCevre);
        System.out.println("Karenin Kosegen Uzunlugu = "+kareKose);
        System.out.println();
        System.out.println("Cevrenin Alani= "+cevreAlan);
        System.out.println("Cevrenin Cevresi= "+cevreCevre);
        System.out.println();
        System.out.println(" Alan Farki= "+Math.abs(kareAlan-cevreAlan));
        System.out.println(" Cevre Farki= "+Math.abs(kareCevre-cevreCevre));


    }
}
