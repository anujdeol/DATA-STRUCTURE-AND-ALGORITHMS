package dsa.patterns;

import java.util.Scanner;

public class Pattern18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sp = 1;
		int st = n;

		for (int i = 1; i <= n; i++) {

			for (int k = 1; k <= sp; k++) {
				System.out.print(" ");

			}
			for (int j = 1; j <= st; j++) {
				if(i>1 && i<=n/2 && j>1 && j<st  )
				{
					System.out.print(" ");
				}
				else {
				System.out.print("*");
				}

			}

			System.out.println();

			if (i <= n / 2) {
				st -= 2;
				sp++;
			} else {
				st += 2;
				sp--;
			}

		}

	}

}
