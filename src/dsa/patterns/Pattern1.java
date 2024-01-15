package dsa.patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int temp=n;

		for (int i = 0; i < temp; i++) {

			for (int j = 0; j < n; j++) {
				System.out.print("*");
				
			}
			n--;
			System.out.println("\n");
	
			
		}

	}

}
