package dsa;

import java.util.Scanner;

public class NIsPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to test:");
        int t = sc.nextInt();
        int[] arrayNos = new int[t];
        System.out.println("Please enter your numbers:");

        for (int i = 0; i < t; i++) {
            arrayNos[i] = sc.nextInt();
        }

        int j;
        for (j = 0; j < t; j++) {
            int i;
            int e = arrayNos[j];
            System.out.println("Number check: " + e);
            int count = 0;
            for (i = 2; i <= e; i++) {
                if (e % i == 0) {
                    count++;
                }
            }

            if (count != 1) {
                System.out.println(e + " is not prime.");
            } else {
                System.out.println(e + " is prime.");
            }
        }
    }

}
