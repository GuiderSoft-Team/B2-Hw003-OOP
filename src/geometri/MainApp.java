package geometri;

public class MainApp {
    public static void main(String[] args) {
        int kareAlan=Kare.alanHesapla(7);
        System.out.println("Karenin Alani: "+kareAlan);

        int kareCevre=Kare.cevreHesapla(7);
        System.out.println("Karenin Cevresi: "+kareCevre);

        double kosegenUzunlugu=Kare.kosegenUzunlugu(7);
        System.out.printf("Kosegen Uzunlugu: %5.2f \n",kosegenUzunlugu);

        System.out.println();
        double daireAlan=Daire.alanHesapla(7);
        System.out.printf("Dairenin Alani: %5.2f \n",daireAlan);

        double daireCevre=Daire.cevreHesapla(7);
        System.out.printf("Dairenin Cevresi: %5.2f \n",daireCevre);

        System.out.println();
        System.out.printf("Alanlar Farki: %5.2f \n",Math.abs(kareAlan-daireAlan));
        System.out.printf("Cevreler Farki: %5.2f \n",Math.abs(kareCevre-daireCevre));



    }
}
