package beforeapplicationofSOLID.opencloseprinciple;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        Rectangle rect = new Rectangle(3, 4);
        Circle circ = new Circle(2);

        System.out.println("Rectangle area: " + calc.calculateArea(rect));
        System.out.println("Circle area: " + calc.calculateArea(circ));
    }
}