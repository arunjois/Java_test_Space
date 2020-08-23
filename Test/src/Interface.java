interface i {
	int m=100;
	void display();
}
abstract class a implements i {
	public void getdata() {
		System.out.println("M="+m);
	}
}
class B extends A {
	void display() {
		System.out.println("Interface Demo");
	}
}
class Interface {
	public static void main(String args[]) {
		B b= new B();
		b.display();
		b.getdata();
	}
}
