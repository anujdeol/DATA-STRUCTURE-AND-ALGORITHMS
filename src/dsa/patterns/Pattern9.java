package dsa.patterns;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		

		for (int j = 1; j <= n; j++) {
			for (int k = 1; k <= n; k++) {
				
				if(k+j==n+1||k==j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}
}
