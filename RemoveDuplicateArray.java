package searching;

import java.util.HashSet;

public class RemoveDuplicateArray {
	
	public static void oneWay(int[] a) {
		int[] temp=new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j]=a[i];
				j++;
			}
		}
		temp[j]=a[a.length-1];
		for(int n:temp) {
			System.out.print(n+" ");
		}
	}
	public static void secondWay(int[] a) {
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		for(int i=0;i<=j;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void usingHashSet(int[] a) {
		HashSet<Integer> hs=new HashSet<>();
		for(int n:a) {
			hs.add(n);
		}
		for(int n:hs) {
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		int[] a= {1,2,2,3,4,4,5,5,6};
		//oneWay(a);
		//secondWay(a);
		usingHashSet(a);
	}
}
