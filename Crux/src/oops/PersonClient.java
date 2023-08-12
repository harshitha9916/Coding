package oops;

public class PersonClient {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person(20);
		Person p4 = new Person("Harshitha",20);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		System.out.println(p2.name+" "+ p2.age);
		//p2.name = "H";
		//p2.age=22;
		//p2.setName("Harshi");
		//p2.setAge(22);
		System.out.println(p3.name+" "+ p3.age);
		System.out.println(p4.name+" "+ p4.age);
	}

}
