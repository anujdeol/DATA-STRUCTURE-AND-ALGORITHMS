package dsa.numbers;

import java.util.Scanner;

public class SubstractionOfAnyBaseNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int base = sc.nextInt();
		int finaly = 0;
		int carry = 0;
		int x = 0;
		int rem = 0;

		while (n1 > 0 ){
			int lastNo1 = n1 % 10;
			int lastNo2 = n2 % 10;
			n1 = n1 / 10;
			n2 = n2 / 10;
			lastNo1=lastNo1+carry;

			if (lastNo1 >= lastNo2) {
				rem = lastNo1 - lastNo2;
				carry = 0;
			} else {

				carry = -1;
				rem = (lastNo1 + base) - lastNo2;

			}

			rem = rem * (int) Math.pow(10, x);
			finaly = rem + finaly;
			x++;

		}
		System.out.print(finaly);

	}

}
