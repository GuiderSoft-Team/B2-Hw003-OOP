package geometri;

public class MainApp {
    public static void main(String[] args) {
        Kare k1=new Kare(7);
        Daire d1=new Daire(7);
        double aF=Math.abs(k1.alanHesapla()-d1.alanHesapla());
        double cF=Math.abs(k1.cevreHesapla()-d1.cevreHesepla());
        System.out.printf("%s %5.2f %s %5.2f","Alanlar farkı =",aF,"Çevreler Farkı",cF);

    }
}
