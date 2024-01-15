package dsa.patterns;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int st = n / 2 + 1;
		int sp = 1;
		for (int i = 0; i <= n; i++) {

			for (int j = 0; j < st; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < sp; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < st; j++) {
				System.out.print("*");
			}
			System.out.println("\n");

			if (i < n/2) {
				st--;
				sp += 2;
				
				

			}
			if(i >= n/2) {
				sp-=2;
				st++;
				
			}
			

		}

	}

}
