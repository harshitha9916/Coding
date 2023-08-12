package oops;

public class ResverseStack {
public static void main(String[] args) throws Exception {
	StackUsingArrays s = new StackUsingArrays(5);
	
	for(int i=1;i<=5;i++) {
		s.push(i*10);
	}
	s.display();
	StackUsingArrays helper = new StackUsingArrays(5);
	rs(s,helper,0);
	s.display();
}
public static void rs(StackUsingArrays s,StackUsingArrays helper,int index) throws Exception {
	if(s.isEmpty()) {
		return;
	}
	int item =s.pop();
	rs(s,helper,index+1);
	helper.push(item);
	if(index==0) {
		while(!helper.isEmpty()) {
			
			s.push(helper.pop());
		}
	}
	
}
}
