public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
        int num1 = (int) (n1 * 1000);
        int num2 = (int) (n2 * 1000);
        return num1 == num2;
    }
}