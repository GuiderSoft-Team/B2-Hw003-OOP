package Homework;

public class Daire {
    int yaricap;
    public Daire(int yaricap){
     this.yaricap = yaricap;
    }

    public double alanHesapla()

    {


        return Math.PI * yaricap * yaricap;


    }
    public double cevreHesapla(){
        return 2*Math.PI*yaricap;
    }

}
