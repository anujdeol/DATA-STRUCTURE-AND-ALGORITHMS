package dsa;

import java.util.Scanner;

public class PrimeFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i <= n/2; i++) {

			while (n%i== 0) {
				n = n / i;
				System.out.println(i);

			}
		
			
			
		}
		System.out.println(n);

	}
}
