package dsa.numbers;

import java.util.Scanner;

public class AnyBaseToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int base = sc.nextInt();
		int x = 0;
		int finalNum = 0;

		while (number != 0) {

			int baseNum = number % 10;
			number = number / 10;
			int base2 = baseNum * (int) Math.pow(base, x);

			finalNum = finalNum + base2;

			x++;
		}
		System.out.println(finalNum);

	}
}
