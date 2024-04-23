package searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LongConsecutiveSequence {
	
	public static void findLongestConseqSubseq(int[] a) {	//6,3,9,1,5,10,4,2
		Arrays.sort(a);		//1,2,3,4,5,6,9,10
		int ans=0,count=0;	// ans=0, count=0
		ArrayList<Integer> v=new ArrayList<>();	
		v.add(a[0]);	//1
		for(int i=1;i<a.length;i++) {	//i=4
			if(a[i]!=a[i-1]) {			//a[3]!=a[3-1=2]== 5!=4
				v.add(a[i]);			//1,2,3,4,5,6,9,10
			}
		}
		for(int i=0;i<v.size();i++) {			//i=0,1,2,3,4,5,6,7
			if(i>0 && v.get(i)==v.get(i-1)+1) {		//(7>0 && 10==9+1)
				count++;							//2
			}
			else {
				count=1;// 1
			}
			ans=Math.max(ans,count);	// ans=(5,2) = 5
		}		
		System.out.print("length of longest consecutive sequence : "+ans);
	}
	
	public static void usingHS(int[] a) {
		HashSet<Integer> hs=new HashSet<>();
		for(int n:a) {
			hs.add(n);
		}		
		int seq=0;
		for(int i=0;i<a.length;i++) {	// i=0,1,2
		if(!hs.contains(a[i]-1)) {		// hs!=a[2]-1=9-1=8 =yes
				int no=a[i]; 			//no=a[2]=9
				while(hs.contains(no)) {	//hs==9,10
					System.out.print(no+" ");
					no++;		//10,11
				}
				System.out.println();
				if(seq<no-a[i]) {		//0<11-9=2
					seq=no-a[i];		//seq=2
				}					
			}			
		}	
		System.out.println("\nlength of longest consecutive sequence : "+seq);
	}

	public static void main(String[] args) {
		int[] a= {6,3,9,1,5,10,4,2,14,12,13};
		usingHS(a);
		//findLongestConseqSubseq(a);	
	}

}
