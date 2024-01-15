package dsa;

import java.util.Scanner;

public class isPrime {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int count = 1;
			int num = sc.nextInt();
			for (int i = 2; i <= num/2; i++) {

				if (num>1 && num % i == 0) {

					count++;

				} else {

				}

			}
			if (count == 1) {
				System.out.println("Prime");

			} else {
				System.out.println("Not Prime");
			}

		}
	}

}
