package geometri;

public class circle {
    int radius;
    public circle(int radius){
        this.radius=radius;

    }

    public double areaCalculate(){
        return Math.PI*radius*radius;
    }
    public double enCalculate(){
        return 2*Math.PI*radius;
    }

    void ShowCircle(){
        System.out.printf("Daire Alan: %5.2f",areaCalculate());
        System.out.println();
        System.out.printf("Daire Çevre: %5.2f",enCalculate());
    }


}
