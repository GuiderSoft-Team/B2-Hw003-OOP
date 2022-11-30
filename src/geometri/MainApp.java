package geometri;

public class MainApp {
    public static void main(String[] args) {
        int alan1=Kare.alanHesapla(7);
        int cevre1=Kare.cevreHesapla(7);
        double kosegen=Kare.kosegenUzunlugu(7);

        double alan2=Daire.alanHesapla(7);
        double cevre2=Daire.cevreHesapla(7);

        double mutlakDegerAlan=Math.abs(alan1-alan2);
        System.out.println("Alanların mutlak değeri ="+mutlakDegerAlan);

        double mutlakDegerCevre=Math.abs(cevre1-cevre2);
        System.out.println("Çevrelerin mutlak değeri ="+mutlakDegerCevre);


        }


    }

