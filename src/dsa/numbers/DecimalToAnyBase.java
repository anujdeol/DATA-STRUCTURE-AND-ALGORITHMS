package dsa.numbers;

import java.util.Scanner;

public class DecimalToAnyBase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int base = sc.nextInt();
		int x = 0;
		int finalNum = 0;

		if (base == 2) {
			while (number != 0) {

				int baseNum = number % 2;
				number = number / 2;
				int base2 = baseNum * (int) Math.pow(10, x);
				
				
				finalNum = finalNum + base2;

				x++;
			}
			System.out.println(finalNum);

		}

		else if (base == 8) {
			
			while (number != 0) {

				int baseNum = number % 8;
				number = number / 8;
				int base2 = baseNum * (int) Math.pow(10, x);
				
				
				finalNum = finalNum + base2;

				x++;
			}
			System.out.println(finalNum);

			
			

		} else if (base == 10) {
			
			while (number != 0) {

				int baseNum = number % 10;
				number = number / 10;
				int base2 = baseNum * (int) Math.pow(10, x);
				
				
				finalNum = finalNum + base2;

				x++;
			}
			System.out.println(finalNum);


		}
	}

}
