package searching;

import java.util.HashSet;

public class FindMissingNo {
	
	public static void useSum(int[] a) {
		int sum=0;
		int xno=a.length+1;
		int no=(xno*(xno+1))/2;
		//System.out.println(no);
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		if(no!=sum) {
			System.out.println("missing element is : "+(no-sum));
		}
		else {
			System.out.println("no missing element");
		}
	}
	public static void useXOR(int[] a) {
		int xor=a[0],xor1=1;
		for(int i=1;i<a.length;i++) {
			xor=xor^a[i];
		}
		for(int i=2;i<=a.length+1;i++) {
			xor1=xor1^i;
		}
		if(xor1!=xor) {
			System.out.println("missing element is : "+(xor-xor1));
		}
		else {
			System.out.println("no missing element");
		}
	}
	public static void useHashSet(int[] a,HashSet hs) {
		int x=a[a.length-1];
		int flag=0;
	    for(int i=0;i<a.length;i++) {
	    	hs.add(a[i]);
	    }
	    System.out.print("missing elements : ");
	    for(int i=1;i<x;i++) {
	    	boolean b=hs.add(i);
	    	if(b==true) {
	    		flag++;
	    		System.out.print(i+" ");
	    	}		
	    }
		if(flag==0) {
			System.out.println("no missinig element");
		}
	}
	public static void simpleCase(int[] a) {
		int flag = 0;
	    int count = 1;
	    System.out.print("missing elements : ");
//	    for(int i=0;i<a.length;i++){
//	      if(a[0]!=1) {
//	        System.out.print(count+" ");
//	        count++;
//	        flag++;
//	      if(count == a[0]){
//	        break;
//	        }        
//	      }
//	    }
	    for (int i = 0; i < a.length-1 ; i++) { //i=1
		      if ((a[i] + 1) != a[i + 1]) {		//4-1!=4
		        flag++;
		        System.out.print((a[i] + 1)+" "); 	//
		      } 
		    }
	    if (flag == 0) {
	      System.out.println("There is no missing element");
	    }
	}
	public static void main(String[] args) {
		int[] a= {3,4,7};
		HashSet<Integer> hs=new HashSet<>();
		//useSum(a);
		//useXOR(a);
		//useHashSet(a,hs);
		simpleCase(a);
	}
}
