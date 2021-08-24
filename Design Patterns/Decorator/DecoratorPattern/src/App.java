public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Shapes circle = new Circle();

        Shapes redCircle = new RedShape(new Circle());

        Shapes triangle = new Triangle();

        Shapes blueTriangle = new BlueShape(new Triangle());

        System.out.println("Basic shapes!");
        circle.drawShape();
        triangle.drawShape();

        System.out.println("\nColored shapes shapes!");
        redCircle.drawShape();

        blueTriangle.drawShape();
    }
}
