package dsa.patterns;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int col = 2 * n - 1;
		int sp = 2 * n - 3;
		int num2 = 0;

		for (int i = 1; i <= n; i++) {
			int num = 1;

			for (int j = 1; j <= i; j++) {
				System.out.print(num);
				num++;
				num2 = num;
			}

			for (int k = 0; k < sp; k++) {
				System.out.print(" ");
			}
			sp -= 2;
			int test=i;
			int num1 = num2 - 1;
			if (sp < -2) {
				num1--;
				test--;

			}

			for (int j = 0; j < test; j++) {
				System.out.print(num1);
				num1--;

			}

			System.out.println();

		}
	}
}
