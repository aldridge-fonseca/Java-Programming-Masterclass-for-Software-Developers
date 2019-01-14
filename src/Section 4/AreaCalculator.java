public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) return -1;
        return 3.14159 * radius * radius;
    }

    public static double area(double length, double height) {
        if (length < 0 || height < 0) return -1;
        else return length * height;
    }
}