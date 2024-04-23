package searching;

import java.util.*;

public class FindDuplicate {
	
	public static void bruteForce(int[] a) {
		int flag=0;
		for(int i=0;i<a.length-1;i++) {	//i=0
			int count=1;				//count=
			for(int j=i+1;j<a.length;j++) {	//j=5
				if(a[i]==a[j]) {			//(2==2
					count++;
					System.out.print(a[j]+" ");//count=2
				}		
			}
			//System.out.println("element "+a[i]+" occurence count is:"+count);
		}
	}

	
	public static void main(String[] args) {
		int[] a= {2,4,1,4,2,6,1,2,1};
		System.out.println("Duplicate numbers are: ");
		bruteForce(a);
		
		//using map
//		Set<Integer> s=new HashSet<>();
//		for(int no : a) {
//			boolean b=s.add(no);
//			if(b==false) {
//				System.out.print(no+" ");
//			}
//		}
		
		
		//using hashmap
/*		Map<Integer,Integer> m=new HashMap<>();
		for(int no:a) {
			Integer count=m.get(no);
			if(count==null) {
				m.put(no, 1);
			}
			else {
				count++;
				m.put(no, count);
			}
		}
		Set<Map.Entry<Integer, Integer>> es=m.entrySet();
		for(Map.Entry<Integer, Integer> me:es) {
			if(me.getValue()>1) {
				System.out.print(me.getKey()+" ");
			}
		}*/
	}

}
