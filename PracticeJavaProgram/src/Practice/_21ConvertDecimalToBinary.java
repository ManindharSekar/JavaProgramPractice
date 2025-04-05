package Practice;

public class _21ConvertDecimalToBinary {
	
	public static void toBinary(int decimal) {
		int binary[]=new int[10];
		int index=0;
		while(decimal>0) {
			binary[index++]=decimal%2;
			decimal=decimal/2;
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("the binary value of 25 is: ");
		toBinary(25);
		System.out.print("the binary value of 33 is: ");
		toBinary(33);
		System.out.print("the binary value of 12 is: ");
		toBinary(12);

	}

}
