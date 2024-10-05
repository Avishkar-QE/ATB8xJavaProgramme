package logical;

public class Factorial {
    public static void main(String[] args) {
        int number = 153;
        int sum = sumOfFactorialOfDigits(number);
        System.out.println("The sum of the factorial of each digit in " + number + " is: " + sum);
    }

    public static int sumOfFactorialOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

