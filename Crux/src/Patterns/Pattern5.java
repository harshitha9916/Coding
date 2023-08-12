package Patterns;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int row=0; row<n; row++) {

			for(int nsp=0; nsp<row; nsp++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for(int row=0; row<n-1; row++) {

			for(int nsp=n-row-1; nsp>0; nsp--) {
				System.out.print("*");
			}

			System.out.println();
		}


	}
}
