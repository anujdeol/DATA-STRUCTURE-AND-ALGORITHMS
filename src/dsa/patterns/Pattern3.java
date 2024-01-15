package dsa.patterns;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int temp = n;
		int sp = n - 1;
		int st = 1;

		for (int i = 0; i < temp; i++) {
			for(int j=0; j<sp; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<st; k++)
			{
				System.out.print("*");
			}
			sp--;
			st++;
			System.out.println("\n");
		}

	}

}
