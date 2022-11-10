package geometri;

public class MainApp {
    public static void main(String[] args) {

            KareSınıfı karesınıfı = new KareSınıfı(7);
            DaireSınıfı daireSınıfı=new DaireSınıfı(7);
            System.out.println(karesınıfı.showInfo());
            System.out.println(daireSınıfı.showInfo());

            double alanlarFarkı=Math.abs(karesınıfı.kareAlan()-daireSınıfı.daireAlan());
            double cevererlarFarkı=Math.abs(karesınıfı.kareCevre()-daireSınıfı.daireCevre());

        System.out.printf("Alanlar Farkı :%5.2f\n Çevreler Farkı :%5.2f",alanlarFarkı,cevererlarFarkı);

        }
    }

