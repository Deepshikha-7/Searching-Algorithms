package searching;

import java.util.*;

public class OnceInArray { 

	public  static void useXOR(int[] a) { //{1,2,3,5,1,2,3}
		int res=a[0]; // 1
		for(int i=1;i<a.length;i++) { // a[3]=5
			res=res^a[i];	// res=1^2=3, 3^3=0, 0^5=5, 5^1=4, 4^2=6, 6^3=3
		}				
		System.out.print(res+" ");	//5 
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,3,8,1,2,3,5}; // 1^1, 2^2, 3^3, 5 = 0,0,0,5
		System.out.println("single repeated number: ");
		//useXOR(a);
		Map<Integer,Integer> m=new HashMap<>();
		for(int no:a) {
			Integer count=m.get(no);
			if(count==null) {
				m.put(no, 1);
			}
			else {
				count++;
				m.put(no,count);
			}
		}
		Set<Map.Entry<Integer, Integer>> es=m.entrySet();
		for(Map.Entry<Integer, Integer> me:es) {
			if(me.getValue()==1) {
				System.out.print(me.getKey()+" ");
			}
		}
  }
}
