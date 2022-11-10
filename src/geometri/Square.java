package geometri;

public class Square {

    public int kenar;

        public double calculateArea (){
            return Math.pow(kenar,2);
        }
        public  double calculateLength (){
            return 4*kenar;
        }
        public double diagnolLength (){
            return kenar*Math.sqrt(2);
        }

        public Square (int kenar){
            this.kenar=kenar;
    }
}

