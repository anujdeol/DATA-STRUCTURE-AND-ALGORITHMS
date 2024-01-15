package dsa;

import java.util.Scanner;

public class ReverseOfANumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n!=0)
		{
			int rn=n%10;
			System.out.print(rn);
			int q=n/10;
			n=q;
			
			
		}
		
	}

}
