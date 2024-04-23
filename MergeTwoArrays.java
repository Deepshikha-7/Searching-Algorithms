package searching;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] arr1= {6,7,8,9};
		int[] res=new int[arr.length+arr1.length];
		
		for(int i=0;i<arr.length;i++) {
			res[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			res[arr.length+i]=arr1[i];
		}
		for(int n:res) {
			System.out.print(n+" ");
		}	
	}
}
