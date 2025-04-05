package Practice;

public class _35PairOfNumEqualTo20 {
	
	public static void pairOfNum(int a[],int num) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==num) {
					System.out.println(a[i]+","+a[j]+"="+num);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pairOfNum(new int[]{5,15,7,3,9,13,4},20);

	}

}
