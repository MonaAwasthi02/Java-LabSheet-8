public class RectangleBeanDemo {
    public static void main(String[] args) {
        RectangleBean rectangle = new RectangleBean(10, 5);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
