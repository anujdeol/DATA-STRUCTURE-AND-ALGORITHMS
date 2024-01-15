package dsa.numbers;

import java.util.Scanner;

public class AdditionOfTwoBaseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int base = sc.nextInt();
		int finaly = 0;
		int carry = 0;
		int x = 0;

		while (n1 > 0 || n2 > 0 || carry != 0) {
			int lastNo1 = n1 % 10;
			int lastNo2 = n2 % 10;

			int addTwo = lastNo1 + lastNo2 + carry;

			int rem = addTwo % base;
			carry = addTwo / base;

			n1 = n1 / 10;
			n2 = n2 / 10;
			rem = rem * (int) Math.pow(10, x);
			finaly = rem + finaly;
			x++;

		}
		System.out.print(finaly);

	}

}
