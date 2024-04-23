package searching;

public class LinearSearch {
	
	public static void searchInt(int[] a,int value) {
		int flag=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==value) {
				flag=1;
				System.out.println("element found at "+i+" position");
			}
		}
		if(flag==0) {
		System.out.println("element not found");
		}
	}
	
	public static void searchString(String[] b,String value2) {
		int flag=0;
		for(int i=0;i<b.length;i++) {
			if(b[i].equals(value2)) {
				flag=1;
				System.out.println("element found at "+i+" position");
			}
		}
		if(flag==0) {
			System.out.println("element not found");
		}
	}

	public static void main(String[] args) {
		int[] a={32,32,76,12,54,98,45};
		int value=98;
		String[] b= {"raj","geet","loke","deep","annu"};
		String value2="loke";
		//searchInt(a,value);
		searchString(b,value2);
	}

}
