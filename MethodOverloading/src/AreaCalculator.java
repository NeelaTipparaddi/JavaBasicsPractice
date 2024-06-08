public class AreaCalculator {
    public static void main(String[] args) {

        System.out.println("Area of a circle = " + area(7));
        System.out.println("Area of a rectangle = " + area(4, 8));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * (radius * radius);
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return (x * y);
    }
}
