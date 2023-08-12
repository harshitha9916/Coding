package oops;

public class DynamicStackClient {
	public static void main(String[] args) throws Exception {
	DynamicStack s = new DynamicStack(5);
	for(int i=1;i<=5;i++) {
		s.push(i*10);
		
	}
	s.display();
	s.push(60);
	s.push(70);
	s.display();
	System.out.println(s.top());
		
	while(!s.isEmpty()) {
		s.display();
		s.pop();
	}
	}
	

}
