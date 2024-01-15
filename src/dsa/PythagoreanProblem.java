package dsa;

import java.util.Scanner;

public class PythagoreanProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int h=a;
		if(b>=h)
		{
			h=b;
		}
	   if(c>=h)
		{
			h=c;
		}
	   if(h==a)
	   {
		   boolean flag = ((b*b)+(c*c)==(a*a));
		   System.out.println(flag);
	   }
	   else if(h==b)
	   {
		   boolean flag = ((a*a)+(c*c)==(b*b));
		   System.out.println(flag);
	   }
		
	   if(h==c)
	   {
		   boolean flag = ((b*b)+(a*a)==(c*c));
		   System.out.println(flag);
	   }
		
		
		
	}

}
