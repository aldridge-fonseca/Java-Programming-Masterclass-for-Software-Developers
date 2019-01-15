public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99))
            return false;
        int num1 = number1;
        int num2 = number2;

        while (num1 > 0) {
            int rem = num1 % 10;
            while (num2 > 0) {
                if (rem == num2 % 10) return true;
                num2 /= 10;
            }
            num2 = number2;
            num1 /= 10;
        }
        return false;
    }
}