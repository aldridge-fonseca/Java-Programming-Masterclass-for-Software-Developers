public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if ((number1 < 10) || (number1 > 1000) || (number2 < 10) || (number2 > 1000) || (number3 < 10) || (number3 > 1000))
            return false;
        int digit1 = number1 % 10, digit2 = number2 % 10, digit3 = number3 % 10;
        return (digit1 == digit2 || digit2 == digit3 || digit3 == digit1);
    }

}