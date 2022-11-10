package geometri;

public class KareSınıfı {
    int kenar;

    public KareSınıfı(int kenar){
        this.kenar=kenar;
    }
    public int kareCevre(){

        return 4*kenar;
    }
   public int kareAlan(){

        return kenar*kenar;
    }
    public double kosegenUzunlugu(){

        return Math.round(kenar*Math.sqrt(2));

    }
    public String showInfo(){
        return "Karenin Kenar Uzunluğu :"+kenar+ " karenin Çevresi : "+kareCevre()+" Karenin Alanı :"+kareAlan()+" Köşegen Uzunluğu :"+kosegenUzunlugu();
    }
}

