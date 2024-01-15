package dsa;

import java.util.Scanner;

public class DigitOfNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int temp=n;
		while(temp!=0)
		{
			temp=temp/10;
			
			count++;
		}
		int dig = (int)Math.pow(10, count-1);

		while(n!=0)
		{
			 int q= n/dig;
			 System.out.println(q);
			 n=n%dig;
			 dig=dig/10;
			
		}
		
		
		
		
	}

}
