package oops;

public class StackUsingArrays {

	protected int[] data;
	protected int top;
	protected static final int DEFAULT_CAPACITY=10;
	public StackUsingArrays() throws Exception {
		this(DEFAULT_CAPACITY);
	}
	public StackUsingArrays(int capacity) throws Exception {
		if(capacity<1) {
			throw new Exception("Invalid capacity");
		}
		this.data = new int[capacity];
		this.top=-1;
	}
	public int size() {
		return this.top+1;
	}
	public boolean isEmpty() {
		return this.size()==0;
	 }
	public void push(int value) throws Exception{
		if(this.size()==this.data.length) {
			throw new Exception("stack is full");
		}
		this.top++;
		this.data[this.top]=value;
	}
	public int pop() throws Exception{
		if(this.size()==0) {
			throw new Exception("stack is empty");
		}
		
		int rv = this.data[this.top];
		this.data[this.top] = 0;
		this.top--;
		return rv;
	}
	public int top() throws Exception{
		if(this.size()==0) {
			throw new Exception("stack is empty");
		}
		int rv = this.data[this.top];
		return rv;
	}
	public void display(){
	for(int i=this.size()-1;i>=0;i--) {
		System.out.print(this.data[i]+", ");
	}
	System.out.println("END");
	}
}
