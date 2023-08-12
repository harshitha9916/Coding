package oops;

public class Person {

		String name;
		int age;
		Person(){
			System.out.println("I'm a default constructor");
		}
		Person(int age){
			System.out.println("I'm a parameterized constructor");
			this.age=age;
		}
		Person(String name,int age){
			System.out.println("I'm a parameterized constructor");
			this.age=age;
			this.name=name;
		}
		/*Person(int myage){
			System.out.println("I'm a parameterized constructor");
			age=myage;
		}*/
		
		public String getName(){
			return name;
		}
		public int getAge() {
			return age;
		}
		
		

}
