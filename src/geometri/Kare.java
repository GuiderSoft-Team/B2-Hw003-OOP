package geometri;

public class Kare {
    int kenar;

    public Kare( int kenar) {
        this.kenar = kenar;
    }

    public int alanHesapla() {
        return kenar * kenar;
    }

    public int cevreHesapla () {
        return 4 * kenar;
    }

    public int kosegenUzunlugu() {
        return kenar;
    }


    public   void bilgiler(){
        System .out.printf("Alan: %d\n",alanHesapla());
        System.out.printf("Çevre: %d\n",cevreHesapla());
        System.out.printf("Kosege Uzunlugu:%d\n",kosegenUzunlugu());

    }
}
