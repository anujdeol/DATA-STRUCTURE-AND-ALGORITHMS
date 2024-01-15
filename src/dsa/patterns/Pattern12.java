package dsa.patterns;

import java.util.Scanner;

public class Pattern12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a = 0;
		int b = 1;
		

		for (int i = 0; i < n; i++) {

			for (int j = 1; j <= i; j++) {

				int c = a + b;

				System.out.print(" "+a);
				a = b;
				b = c;

			}
			System.out.println(" ");
		}

	}

}
