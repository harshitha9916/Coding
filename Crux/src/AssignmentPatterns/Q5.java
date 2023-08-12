package AssignmentPatterns;

public class Q5 {

	public static void main(String[] args) {
		int n = 5; 
		for(int row=0; row<n; row++) {
			for(int sp=0; sp<row; sp--) {
				System.out.print(" ");

			}
			for(int nst=0; nst<n-row; nst++) {
				System.out.print("*");

			}
			System.out.println();
		}


	}

}
