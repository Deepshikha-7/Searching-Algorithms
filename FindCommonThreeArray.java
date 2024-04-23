package searching;

import java.util.HashSet;

public class FindCommonThreeArray {

	public static void main(String[] args) {
		int[] a= {1,4,3,7,9,2};
		int[] b= {2,5,1,4,8,3};
		int[] c= {3,1,7,8,0};	
		
		HashSet<Integer> hs=new HashSet<>();
		HashSet<Integer> hs1=new HashSet<>();
		int flag=0;
	    for(int i=0;i<a.length;i++) {
	    	hs.add(a[i]);
	    }
	    System.out.print("common elements : ");
	    	for(int i=0;i<b.length;i++) {
	    		boolean x=hs.add(b[i]);
	    			if(x==false) {
	    				//System.out.print(b[i]+" ");
	    				hs1.add(b[i]); 	// 2,1,4,3
	    			}
	    	}	
	    	for(int i=0;i<c.length;i++) {	//3,1,7,8,0
	    		boolean x=hs1.add(c[i]);
    			if(x==false) {
    				flag++;
    				System.out.print(c[i]+" ");	// 1,3
    			}
	    	} 
		if(flag==0) {
			System.out.println("no missinig element");
		}
	}
}


/*
 * for(int i=0;i<a.length;i++) {
	    	hs.add(a[i]);
	    }
	    System.out.print("common elements : ");
	    for(int i=0;i<b.length;i++) {
	    	boolean x=hs.add(b[i]);
	    	if(x==false) {
	    		//System.out.print(b[i]+" ");
	    		for(int j=0;j<c.length;j++) {
	    			boolean y=hs.add(c[j]);
	    			if(y==false) {
	    				flag++;
	    				System.out.print(c[j]+" ");
	    			}
	    		}	
	    	}		
	    }*/
