public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int num = number;
        int reverse = 0;
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        return (reverse == number);
    }

}