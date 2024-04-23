package searching;

public class InsertInArray {

	public static void insertAtPosition(int[] a) {
		int pos=4,val=8;
		System.out.println("before insertion");
		for(int n:a) {
			System.out.print(n+" ");
		}
		for(int i=a.length-1;i>pos-1;i--) {
			a[i]=a[i-1];
		}
		a[pos-1]=val;
		System.out.println("\nafter inserting 8 at 4th position");
		for(int n:a) {
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		int[] a= {1,3,5,2,6};
		insertAtPosition(a);
		
	}
}
