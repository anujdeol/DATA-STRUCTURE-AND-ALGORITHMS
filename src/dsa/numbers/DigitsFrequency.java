package dsa.numbers;

import java.util.Scanner;

public class DigitsFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int num = sc.nextInt()
;		int count=0;
		while(n!=0)
		{
			int check = n%10;
			int temp = n/10;
			n=temp;
			
			if(check ==num)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
