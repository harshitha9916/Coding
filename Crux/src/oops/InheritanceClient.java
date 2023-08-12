package oops;

public class InheritanceClient {

	public static void main(String[] args) {
		/*Parent p = new Parent();
		System.out.println(p.d);
		Child c = new Child();
		System.out.println(c);*/

		System.out.println("---case 1---");
		Parent p = new Parent();
		System.out.println(p.d);
		System.out.println(p.d1);
		p.fun();
		p.fun1();
		
		System.out.println("---case 2---");
		Parent obj2 = new Child();
		System.out.println(obj2.d);
		System.out.println(obj2.d1);
		System.out.println(((Child)obj2).d2);
		obj2.fun();
		obj2.fun1();
		((Child)obj2).fun2();
		
		System.out.println("---case 3---");
//		Child obj3 = new Parent();
//		System.out.println(obj3.d);
//		System.out.println(obj3.d1);
//		System.out.println(obj3.d2);
		//for this it is not allowed as it gives run time exception
		/*obj3.fun();
		obj3.fun1();
		((Child)obj3).fun2();*/
		
		System.out.println("---case 4---");
		Child obj4 = new Child();
		System.out.println(obj4.d);
		System.out.println(((Parent)obj4).d);
		System.out.println(obj4.d1);
		System.out.println(obj4.d2);
		obj4.fun();
		((Parent)obj4).fun();
		obj4.fun1();
		obj4.fun2();
		
	}

}
