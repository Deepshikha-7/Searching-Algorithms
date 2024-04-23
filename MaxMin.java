package searching;

public class MaxMin {
	
	/*public static void findMax(int[] a) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maximum :"+max);
	}
	public static void findMin(int[] a) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("minimum : "+min);
	} */
	
	public static void findMin(int[] a) {		// 10,4,12,17,2,8,3,9}
		int min=0;
		for(int i=1;i<a.length;i++) { //i=7
			if(a[i]<a[i-1] && a[i]<a[min]) { // 10<4,4<12 && 4<10,12<17&&12<4, 17<2, 2<8 && 2<4,8<3, 3<9 && 3<2
				min=i;		//4:2
			}	
		}
		System.out.println("minimum value is: "+a[min]);
	}
	
	public static void findMax(int[] a) {
		int max=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[i-1] && a[i]>a[max]) {
				max=i;
			}
		}
		System.out.println("maximum value is: "+a[max]);
	}

	public static void main(String[] args) {
		int[] a= {10,9,80,7,6,5,4,3,2};	//10,4,12,17,2,8,3,9,1
		findMin(a);
		findMax(a);	
	}
}
