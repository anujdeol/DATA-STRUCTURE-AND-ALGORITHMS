package dsa.patterns;

import java.util.Scanner;

public class Patter11 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);

		int n = cs.nextInt();
		int k=1;
		for(int i=0; i<n; i++)
		{
		
			for(int j=0; j<=i; j++)
			{
				System.out.print(" "+k);
				k++;
				
			}
			System.out.println();
			
			
		}

	}

}
