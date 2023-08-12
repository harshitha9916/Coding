package AssignmentPatterns;

public class Q4 {

	public static void main(String[] args) {
		int n = 5; 
		for(int row=0; row<n; row++) {
			for(int sp=n-1-row; sp>0; sp--) {
				System.out.print(" ");

			}
			for(int nst=0; nst<row+1; nst++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
