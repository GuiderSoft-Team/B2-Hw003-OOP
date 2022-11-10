package geometri;

public class Circle {

        public int r;

        public double calculateArea (){
            return Math.PI*Math.pow(r,2);
        }
        public  double calculateLength (){
            return 2*Math.PI*r;
        }

        public Circle (int r){
            this.r=r;
        }
    }

