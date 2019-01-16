public class NumberToWords {
    public static void numberToWords(int number) {
        int digits = getDigitCount(number);
        number = reverse(number);
        int digitsrev = getDigitCount(number);

        if (number < 0 || digits == -1 || digitsrev == -1)
            System.out.println("Invalid Value");
        else {
            while (number > 0) {
                switch (number % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("OTHER");
                        break;
                }
                number /= 10;
            }

            while (digits != (digitsrev)) {
                System.out.println("Zero");
                digitsrev++;
            }
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) return 1;
        else {
            while (number > 0) {
                count++;
                number /= 10;
            }
        }
        return count;
    }

    public static int reverse(int number) {
        int reverse = 0;
        boolean negative = false;
        if (number < 0) {
            negative = true;
            number *= -1;
        }
        while ((number) > 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }
        if (negative)
            return -1 * reverse;
        return reverse;
    }
    
}