package searching;

import java.util.HashSet;
public class FindCommonTwoArray {

	public static void usingFor(int[] a,int[] b,HashSet hs) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					hs.add(a[i]);
				}
			}
		}
		for(Object n: hs) {
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		int[] a= {1,4,3,7,9,2,4};
		int[] b= {2,5,1,4,8,3,5};
		HashSet<Integer> hs=new HashSet<>();
		HashSet<Integer> hs1=new HashSet<>();
		System.out.print("common elements : ");
		//usingFor(a,b,hs);
		
		for(int i:a) {
			hs.add(i);
		}
		for(int i:b) {
			hs1.add(i);
		}
		for(int j:hs1) {
			boolean v=hs.add(j);
			if(v==false) {
				System.out.print(j+" ");
			}
		}
	}
}
