package dsa.patterns;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sp=1
			;
		int st=n-1;
		
		
		for(int i=0; i<=n; i++) {
			for(int k=1; k<sp; k++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=st; j++)
			{
				System.out.print("*");
			}
			
			System.out.println("\n");
			st--;
			sp++;
		}

	}

}
