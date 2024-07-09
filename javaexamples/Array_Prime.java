public class Array_Prime {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 0;

        while (index < numbers.length) {
            int num = numbers[index];
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                int divisor = 2;
                while (divisor < num) {
                    if (num % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                    divisor++;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }

            index++;
        }
    }
}