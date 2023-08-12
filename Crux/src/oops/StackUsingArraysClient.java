package oops;

public class StackUsingArraysClient {

	public static void main(String[] args) throws Exception {
		StackUsingArrays s = new StackUsingArrays(5);
		/*s.push(10);
		s.display();
		s.push(20);
		s.display();*/
		for(int i=1;i<=5;i++) {
			s.push(i*10);
			s.display();
		}
		//s.push(60);
		//s.display();
		System.out.println(s.top());
		
		/*s.pop();
		s.display();
		System.out.println(s.top());*/
		
		while(!s.isEmpty()) {
			s.display();
			s.pop();
		}
		//s.pop();
	}
	

}
