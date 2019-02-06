interface il {
	int m=100;
}
interface i extends il {
	void display();
}
abstract class A implements i {
	public void getdata() {
		System.out.println("M="+m);
	}
	public void display() {
		System.out.println("From A");
	}
}
class B extends A {
/*	void display() {
		System.out.println("M="+m);
	}
*/
}
class InterfaceExtends {
	public static void main(String args[]) {
		B b = new B();
		b.display();
		b.getdata();
	}
}
