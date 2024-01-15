package dsa.patterns;

import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sp = n / 2;
		int st = 1;

		for (int i = 1; i <= n; i++) {
			int tempst = st;
			int tempsp = sp;
			if (i == n / 2+1) {
				st = n;
				sp = 0;
			}

			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= st; k++) {
				System.out.print("*");
			}
			st = tempst;
			sp = tempsp;

			if (i <= n / 2) {
				st++;
			} else {
				st--;
			}
			System.out.println();

		}

	}

}
