package myk;

import java.util.Scanner;

public class examen {
	public static void main(String[] cecyto) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if (a > b && a > c) {
			System.out.println(a);
		} 
		if (b > a && b > c) {
			System.out.println(b);
		}
		if (c > a && c > b) {
			System.out.println(c);

		}
	}

}
