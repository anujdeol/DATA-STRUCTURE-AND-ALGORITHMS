package dsa;

import java.util.Scanner;

public class fibonacciSeries {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
	int a=0,b=1,c = 0;
	for(int i=0; i<=n; i++)
	{
		
		
		System.out.println(c);
		c=a+b;
		b=a;
		a=c;
		
		
	}
	}

}
