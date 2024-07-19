package Practice;

public class _44FindQuotientRemainderWitOutUseModDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int divident=40;
		int divisor=4;
		int quotient=0;
		while(divident>=4) {
			divident=divident-divisor;
			quotient++;
		}
		System.out.println("quotient is: "+quotient);
		System.out.println("Remainder is: "+divident);
		

	}

}
