package oops;

public class Student {
	
	//private for data hiding
    private String name;
    private int age;
    
    public void setAge(int age) throws Exception{
    	if(age<0) {
    		throw new Exception("Age cannot be negative");
    	}
    	this.age=age;
    }
    public int getAge() {
    	return this.age;
    }
    
    public String getName() {
    	return name;
    }
    public void setName(String name) throws Exception {
    	//business rules checked
    	if (name.equals("") || name==null) {
    		throw new Exception ("String can't be empty");
    	}
    	this.name=name;
    }
    //final means it can be set once only, can be public
    public final int rollNo;
    //static means it belongs to class, it is not copied for each object
    private static int NoOfStudents=0;
    public static int getNoOfStudents() {
    	return Student.NoOfStudents;
    }
    public static final int MaxStudents=1000;
    public Student(String name) throws Exception{
    	if(Student.NoOfStudents==Student.MaxStudents){
    		throw new Exception("max limit reached");
    	}
    	this.setName(name);
    	Student.NoOfStudents++;
    	this.rollNo=Student.NoOfStudents;
    	
    }
    //can access both static and non static members
    public void NonStaticFunction() {
		System.out.println(this.name + "says hello to" + Student.NoOfStudents+"students.");
	}
    //can access only static data members
    //can't use this inside it
    //cannot access non static members
    //no need to create object, can directly called via classname
    public static void StaticFunction() {
		System.out.println(Student.NoOfStudents+" out of possible "+Student.MaxStudents);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static String UniformColor="White";
	public String getUniformColor() {
		return Student.UniformColor;
	}
	public void SetUniformColor(String uniformColor) {
		Student.UniformColor=uniformColor;	
	}
}
