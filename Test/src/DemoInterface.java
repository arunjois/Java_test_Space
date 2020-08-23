interface i {
	int M=100;
	void display();
}
class A implements i {
	public void display() {
		System.out.println("Hello");
	}
	void read() {
		System.out.println("Interface DEMO");
	}
}
class DemoInterface {
	public static void main(String args[]) {
		A a = new A();
		a.display();
		a.read();
		}
}
