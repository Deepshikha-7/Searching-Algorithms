package searching;

import java.util.HashSet;

public class FirstDuplicateNo {
	
	public static void findFirstDuplicate(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					System.out.print("first duplicate value: "+a[j]+" ");
					break;
				}
			}
			if(count>1) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		int[] a= {5,2,1,2,4,3,5,1};
		//findFirstDuplicate(a);
		
		HashSet<Integer> hs=new HashSet<>();// 1,5,3,4,2
		int temp=-1;
		for(int i=a.length-1;i>=0;i--) {// -1
			if(hs.contains(a[i])) {// a[0]=5
				temp=i;// 0
			}
			else {
				hs.add(a[i]); // a[7], a[6],5,4,
			}
		}
		if(temp!=-1) {
			System.out.println("first duplicate no: "+a[temp]); // a[0]=5
		}
		else {
			System.out.println("there is no duplicate element");
		}
	}

}
