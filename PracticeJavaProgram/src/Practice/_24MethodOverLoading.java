package Practice;

public class _24MethodOverLoading {
	
	static void meth(int num) {
		System.out.println(num);
	}
	static void meth(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meth(10);
		meth("Manindhar");

	}

}
