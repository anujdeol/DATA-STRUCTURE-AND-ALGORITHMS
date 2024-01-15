package dsa;

import java.util.Scanner;

public class RotateNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println("Enter a number from you want to rotate");

		int rotNum = sc.nextInt();

		int div = (int) Math.pow(10, rotNum);

		int lastNum = num % div;
		int firstNum = num / div;

		System.out.println(lastNum);
		System.out.println(firstNum);

		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Count: "+count);
		int mul = (int)Math.pow(10, count-2);
		System.out.println(mul);
		
		int first = lastNum*mul;
		int finalNum = first+firstNum;
		System.out.println("Rotated Num: "+finalNum);
	}

}
