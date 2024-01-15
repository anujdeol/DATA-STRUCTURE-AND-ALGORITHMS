package dsa.patterns;

import java.util.Scanner;

public class Pattern15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sp = n / 2;
		int st = 1;
		int i = 0;
		int j = 0;
		int z = 1;
		int num = 1;
		for (int k = 1; k <= n; k++) {
			for (i = 1; i <= sp; i++) {
				System.out.print(" ");
			}

			int cnum = num;
			for (j = 0; j < st; j++) {
				System.out.print(cnum);
				if (j < st / 2)
					cnum++;
				else {
					cnum--;
				}

			}

			System.out.println();

			if (k <= n / 2) {
				sp--;
				st += 2;
				z++;
				num++;
			} else {
				st -= 2;
				sp++;
				z--;
				num--;
			}

		}

	}

}
