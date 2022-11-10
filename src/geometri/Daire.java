package geometri;

public class Daire {

        public double yaricap;

        public  Daire(double yaricap) {
            this.yaricap = yaricap;

        }

        public double alanHesapla(double yaricap){

            return Math.PI*yaricap*yaricap;
        }
        public double cevreHesapla(double yaricap){

            return 2*Math.PI*yaricap;
        }
    }

