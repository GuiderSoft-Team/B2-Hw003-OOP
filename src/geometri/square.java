package geometri;

public class square {
    int side;
    public square(int side){
        this.side=side;

    }

    public int sideCalculate(){
        return side*side;
    }
    public int perCalculate(){
        return 4*side;

    }
    public double diagonalLenght(){
        return side*Math.sqrt(2);
    }

    void showInfo(){
        System.out.printf("Alan: %d\n" ,sideCalculate());
        System.out.printf("Çevre: %d\n",perCalculate());
        System.out.printf("Köşegen Uzunluğu: %5.2f",diagonalLenght());
    }
}
