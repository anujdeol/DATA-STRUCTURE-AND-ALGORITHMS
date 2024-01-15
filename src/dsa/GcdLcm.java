package dsa;

import java.util.Scanner;

public class GcdLcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstN = sc.nextInt();
		int secondN = sc.nextInt();
int o1 = firstN;
int o2 = secondN;

		while (firstN%secondN!= 0) {

			int rem = firstN % secondN;
			 secondN = rem;
			firstN = secondN;
			
			
			
	
		}
		System.out.println("GCD: "+secondN);
	
		System.out.println("LCM: " +(o1*o2)/secondN);

	}

}
