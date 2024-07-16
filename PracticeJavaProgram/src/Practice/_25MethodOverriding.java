package Practice;

class A{
	void meth() {
		System.out.println("super class method");
	}
}
class B extends A{
	void meth() {
		System.out.println("sub class method");
	}
}

public class _25MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.meth();

	}

}
