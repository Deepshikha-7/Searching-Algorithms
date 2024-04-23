package searching;

public class BinarySearch {
	
	public static void searchNo(int[] a,int val) { // {2,4,6,8,10,12,16,19,23}
		int start=0;
		int end=a.length-1;
		int flag=0;
		while(start<=end) {			// {2,4,6,12,12,12,12,12,12,23,43};
			int mid=(start+end)/2;		 // mid =5 	
			if(a[mid]==val) {
				flag=1;
				System.out.println("first value found at position:"+mid); // 5:12
				int add1=mid+1; // add1= 6
				int add2=mid-1; // add2=4
				System.out.println("\nright side duplicate values :-");
				while(a[(add1)]==val) { // a[9] 23== 12
					System.out.println("value found at position:"+add1); // 6:12, 7:12, 8:12
					add1++; // 9
				 }
				System.out.println("\nleft side duplicate values :-");
				while(a[(add2)]==val) { // a[3] 6==12 
					System.out.println("value found at position:"+add2);	//4:12,3:12
					add2--; // 2
				}
				break;
			}
			else if(a[mid]>val) {
				end=mid-1;
			}
			else if(a[mid]<val) {
				start=mid+1;
			}
		}
		if(flag==0) {
				System.out.println("value not found");
		}
	}
	
	public static void sort(String[] b,String[] c) {
		int min;
		String temp;
		for(int i=0;i<b.length;i++) {
			min=i;
			for(int j=i+1;j<b.length;j++) {
			if(b[i].compareTo(b[j])>0) {
				min=j;
			}
		  }
			temp=b[i];
			b[i]=b[min];
			b[min]=temp;
		}
		for(int i=0;i<b.length;i++) {
			c[i]=b[i];
		}
	}
	
	public static void searchString(String[] c,String val2) {	// deep //annu deep geet loke raj 
		int start=0;
		int end=c.length-1;
		int flag=0;
		while(start<=end) { // 1<=1 
			int mid=(start+end)/2; // 0+5/2=2 // (0+1)/2=0 //1+1=1
			if(c[mid].equals(val2)) { // annu , deep == deep
				flag=1;
				System.out.println("value found at position:"+mid);
				break;
			}
			else if(c[mid].compareTo(val2)>0) { // 97-100=3
				end=mid-1; // 1
			}
			else if(c[mid].compareTo(val2)<0) { // 97-100=-3
				start=mid+1; // 1
			}
		}
		if(flag==0) {
			System.out.println("value not found");
		}
	}
	public static void print(String[] c) {
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a= {2,4,6,12,12,12,12,12,12,23,43};
		int val=12;
		String[] b= {"raj","geet","loke","deep","annu"};
		String[] c=new String[b.length];
		String val2="darsh";
		searchNo(a,val);
		//sort(b,c);
		//print(c);
		//searchString(c,val2);
	}
}

/* mid =(start+end)/2
 * mid=value 
 * a[mid]=10 < 16
 * start =mid+1  =5
 * end=same =9
 * 
 * mid=(start+end)/2 =7
 * a[mid]=19 >16
 * start=same =5
 * end =mid-1 =6
 * 
 * mid=(start+end)/2 = 5
 * a[mid] =12 <16
 * start=mid+1=6
 * end=same=6 
 * 
 * mid=(start+end)/2 = 6
 * a[mid]=16 =16
 * 
 * */