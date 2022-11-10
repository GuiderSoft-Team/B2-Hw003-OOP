package geometri;

public class MainApp {
    public static void main(String[] args) {
       Square v1= new Square(7);
       Circle v2= new Circle(7);

        System.out.printf("%5.2f",Math.abs(v1.calculateArea()- v2.calculateArea()));
        System.out.println();
        System.out.printf("%5.2f",Math.abs(v1.calculateLength()- v2.calculateLength()));

    }
}
