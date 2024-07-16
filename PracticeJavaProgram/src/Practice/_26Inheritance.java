package Practice;

class A1{
	int a;
	int geta() {
		return a;
	}
}
class B1 extends A1{
	int b;
	int showb() {
		
		return b;
	}
}

public class _26Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj=new B1();
		obj.a=10;
		obj.b=15;
		System.out.println(obj.geta());
		System.out.println(obj.showb());
		

	}

}
