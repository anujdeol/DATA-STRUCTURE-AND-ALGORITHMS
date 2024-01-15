package dsa;

import java.util.Scanner;

public class printPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j;
		for (j = 1; j <= n; j++) {

			int count = 0;
			for (i = 1; i <= j / 2; i++) {

				if (n > 1 && j % i == 0) {

					count++;

				} else {

				}
			}
			if (count == 1) {
				System.out.println(j + "");

			} else {
				
			}

		}

	}

}
