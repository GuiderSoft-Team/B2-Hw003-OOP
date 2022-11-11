package ikinci_cozum;

public class Kare {
    public int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

    public int alanHesapla(){

        return kenar*kenar;
    }
    public int cevreHesapla(){
        return 4*kenar;
    }
    public double kosegenUzunlugu(){
        return kenar*Math.sqrt(2);
    }
    public void bilgiGoster(){
        System.out.printf("Alan: %d\n",alanHesapla());
        System.out.printf("Çevre: %d\n",cevreHesapla());
        System.out.printf("Köşegen Uzunluğu: %5.2f\n ",kosegenUzunlugu());
    }
}
