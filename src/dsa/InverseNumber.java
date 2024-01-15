package dsa;

import java.util.Scanner;

public class InverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int op=1;
		int inv=0;
		while(n!=0)
		{
			int od = n%10;
			
			int id=op; //last digit at 0 index and so on
			int ip=od;//0 index
			
			inv = inv+id*(int)Math.pow(10, ip-1);
			
			n=n/10;
			op++;
			
			
			
			
		}
		System.out.println(inv);
		

	}
}
