package dsa.patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sp = n - 2;
		int sp1 = -1;
		int st1 = -1;
		

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			
			if(i==0)
			{
				System.out.print("*");
			}
			else {
			System.out.print("*");
			}

			for (int j = 0; j < sp1; j++) {
				System.out.print(" ");
			}
			if(i==0||i==n-1)
			{
				
			}
			else
			{
				System.out.print("*");
			}
			
			

			System.out.println();
			
			if(i<n/2)
			{
				sp1+=2;
				sp--;
			}
			else {
				sp1-=2;
				sp++;
			}
			
			

		}

	}
}
