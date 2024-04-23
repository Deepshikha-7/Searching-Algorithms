package searching;

import java.util.ArrayList;

public class FindEvenOdd {

	public static void findEven(int[] a){
	    System.out.print("even numbers are : ");
	    int count=0;
	    int sum=0;
	    for(int i=0;i<a.length;i++){
	    if(a[i]%2==0){
	    	count++;
	    	sum=sum+a[i];
	      System.out.print(a[i]+" ");
	    }
	   }
	    System.out.println();
	    System.out.println("total even numbers : "+count);
	    System.out.println("sum of total even numbers : "+sum);
	}
	    public static void findOdd(int[] a){
	      System.out.print("odd numbers are : ");
	      int count=0;
	      int sum=0;
	      for(int i=0;i<a.length;i++){
	      if(a[i]%2!=0){
	    	  count++;
	    	  sum+=a[i];
	        System.out.print(a[i]+" ");
	      }
	    }
	      System.out.println();
		  System.out.println("total odd numbers : "+count);
		  System.out.println("sum of total odd numbers : "+sum);
	   }
	public static void main(String[] args) {
		int[] a={2,1,46,53,23,32,13};
	    //findEven(a);
	    //System.out.println("--------------------------------");
	    //findOdd(a);
		
		//using arraylist
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				a1.add(a[i]);
			}
			else {
				a2.add(a[i]);
			}
		}
		System.out.print("even numbers : ");
		for(int n:a1) {
			System.out.print(n+" ");
		}
		System.out.print("\nodd numbers : ");
		for(int n:a2) {
			System.out.print(n+" ");
		}
	}
}
