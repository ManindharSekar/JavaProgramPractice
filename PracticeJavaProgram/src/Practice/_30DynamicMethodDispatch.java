package Practice;

class A2{
	void callme() {
		System.out.println("inside A2 callme method");
	}
}
class B2 extends A2{
	void callme() {
		System.out.println("inside b2 callme method");
	}
}

public class _30DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a=new A2();
		B2 b=new B2();
		A2 r;
		r=a;
		r.callme();
		r=b;
		r.callme();

	}

}
