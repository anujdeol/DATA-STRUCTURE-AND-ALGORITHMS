package dsa.numbers;

import java.util.Scanner;

public class MultiplicationOfAnyBase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();

        int result = multiplyNumbers(n1, n2, b);
        System.out.println(result);
    }

    public static int multiplyNumbers(int n1, int n2, int base) {
        int result = 0;
        int multiplier = 1;

        while (n2 > 0) {
            int digit = n2 % 10;
            n2 /= 10;
            int product = getProductWithSingleDigit(n1, digit, base) * multiplier;
            result = addNumbers(result, product, base);
            multiplier *= 10;
        }

        return result;
    }

    public static int getProductWithSingleDigit(int n1, int d, int base) {
        int remainder = 0;
        int carry = 0;
        int finaly = 0;
        int placeValue = 0;

        while (n1 > 0 || carry > 0) {
            int lastDigit = n1 % 10;
            n1 /= 10;
            int product = d * lastDigit + carry;
            carry = product / base;
            remainder = product % base;
            remainder *= (int) Math.pow(10, placeValue);
            finaly += remainder;
            placeValue++;
        }

        return finaly;
    }

    public static int addNumbers(int n1, int n2, int base) {
        int result = 0;
        int carry = 0;
        int placeValue = 0;

        while (n1 > 0 || n2 > 0 || carry > 0) {
            int lastDigit1 = n1 % 10;
            int lastDigit2 = n2 % 10;

            int sum = lastDigit1 + lastDigit2 + carry;
            int remainder = sum % base;
            carry = sum / base;
            remainder *= (int) Math.pow(10, placeValue);
            result += remainder;
            placeValue++;
            n1 /= 10;
            n2 /= 10;
        }

        return result;
    }
}
