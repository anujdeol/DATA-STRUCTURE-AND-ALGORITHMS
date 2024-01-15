package dsa.numbers;

import java.util.Scanner;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int base = sc.nextInt();

		int toBase = sc.nextInt();
		int x = 0;
		int finalNum = 0;
		int finalNum1 = 0;

		while (number != 0) {

			int baseNum = number % 10;
			number = number / 10;
			int base2 = baseNum * (int) Math.pow(base, x);

			finalNum = finalNum + base2;

			x++;
		}
		System.out.println(finalNum);

		int y = 0;
		while (finalNum != 0) {

			int baseNum = finalNum % toBase;
			finalNum = finalNum / toBase;
			int base2 = baseNum * (int) Math.pow(10, y);

			finalNum1 = finalNum1 + base2;

			y++;
		}
		System.out.println(finalNum1);

	}
}
