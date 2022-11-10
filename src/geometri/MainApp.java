package geometri;

public class MainApp {
    public static void main(String[] args) {

        square square1=new square(7);
        circle circle1=new circle(7);

        square1.showInfo();
        System.out.println();
        circle1.ShowCircle();
        System.out.println();

        System.out.printf("Fark Alan= %5.2f",Math.abs(square1.sideCalculate()- circle1.areaCalculate()));
        System.out.println();
        System.out.printf("Fark Çevre= %5.2f",Math.abs(square1.perCalculate())- circle1.enCalculate());






    }
}
