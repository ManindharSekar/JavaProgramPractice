package Practice;

public class _33NumOfOccurenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{2,3,4,4,3,2,2};
		int b[]=new int[a.length];
		int v=-1;
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=v;
				}
			}
			if(b[i]!=v) {
				b[i]=count;
			}
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]!=v) {
				System.out.println(a[i]+"-"+b[i]+" Times");
			}
		}

	}

}
