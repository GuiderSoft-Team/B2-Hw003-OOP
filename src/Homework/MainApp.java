package Homework;

public class MainApp {
    public static void main(String[] args) {
      Kare k1= new Kare(7);
      Daire d1= new Daire(7);
      k1.alanHesapla();
      k1.cevreHesapla();
      d1.alanHesapla();
      d1.cevreHesapla();
      double alanFark= ( k1.alanHesapla()- d1.alanHesapla());
      double cevreFark=( k1.cevreHesapla()- d1.cevreHesapla());
        System.out.println(Math.abs(alanFark));
        System.out.println(Math.abs(cevreFark));
    }
}
