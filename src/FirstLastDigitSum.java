public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int num = number;
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            num /= 10;
        }
        return number % 10 + digit;
    }

}