package searching;

public class MaxSumSubArrayKadane {

	public static void main(String[] args) {
		int[] a= {4,-2,-3,4,-1,-2,1,5,-3};
		int max_end=Integer.MIN_VALUE;
		int max_curr=0;
		int s=0,start=0,end=0;
		for(int i=0;i<a.length;i++) {
			max_curr=max_curr+a[i];
			if(max_end<max_curr) {
				max_end=max_curr;
				start=s;
				end=i;
			}
			if(max_curr<0) {
				max_curr=0;
				s=i+1;
			}
		}
		System.out.println(max_end);
		System.out.println("starting : "+start+" ending : "+end);		
	}
}
