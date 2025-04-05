package Practice;

abstract class abst{
	
	abstract void meth();
	
	public void hello() {
		System.out.println("normal method inside abstract class");
	}
}
class second extends abst{

	@Override
	void meth() {
		System.out.println("dynamic use in abstract");
		
	}
	
}
class last extends abst{

	@Override
	void meth() {
		System.out.println("we can use abstract method");
		
	}
	
}

public class _27Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		second s=new second();
		s.meth();
		s.hello();
		last l=new last();
		l.meth();
		
		

	}

}
