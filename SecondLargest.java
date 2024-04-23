package searching;

public class SecondLargest {
	
	public static void sortDesc(int[] a,int[] b) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			max=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[max]) {
					max=j;
				}
			}
			int temp=a[max];
			a[max]=a[i];
			a[i]=temp;
		}
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
	}
	public static void kPositionLargest(int[] b,int position) {
		int n=position-1;
		System.out.println("element of "+position+" largest:"+b[n]);
	}
	
	
	public static void main(String[] args) {
		int[] a= {4,23,41,76,32,96,8,2};
		int[] b=new int[a.length];
		int position=4;
		sortDesc(a,b);
		kPositionLargest(b,position);	
		
		//sortDesc(a,b);
		//System.out.println("second largest:"+b[1]);
	}
}
