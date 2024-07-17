package Practice;

interface A11{
	final int num =12;
	void display();
}

public class _29Interface implements A11{
	public void display() {
		System.out.println("abstract method of interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_29Interface obj=new _29Interface();
		obj.display();
		System.out.println(num);

	}

}
