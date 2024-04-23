package searching;

public class DeleteInArray {

	public static void delByposition(int[] a) {
		int pos=2;
		int len=a.length-1;
		for(int i=pos-1;i<len;i++) {
			a[i]=a[i+1];
		}
		System.out.println("\nafter deletion");
		for(int i=0;i<len;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void delByValue(int[] a) {
		int val=4,count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==val) {
				count++;
				for(int j=i;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				break;
			}
		}
		if(count==0) {
			System.out.println("\ndeleting element not found");
		}
		else {		
			System.out.println("\nafter deletion");
			for(int i=0;i<a.length-1;i++) {
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] a= {2,4,5,7,8,9};
		System.out.println("before deletion");
		for(int n:a) {
			System.out.print(n+" ");
		}
		//delByposition(a);
		delByValue(a);
		
	}
}
