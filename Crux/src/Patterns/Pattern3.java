package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		for(int row=0; row<n; row++) {
			for(int nsp=0; nsp<n-1-row; nsp++) {
				  System.out.print(" ");
			}
			for(int nst=0; nst<row+1; nst++) {
			  System.out.print("*");
		}
			System.out.println();
		}


	}

}
