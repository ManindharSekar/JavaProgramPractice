package Practice;

class demo{
	String email;
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	
}
}

public class _28Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d=new demo();
		d.email="hello@gmail.com";
		d.setPassword("hi@1234");
		System.out.println(d.email);
		System.out.println(d.getPassword());

	}

}
