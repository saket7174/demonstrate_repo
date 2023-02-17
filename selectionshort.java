package assignment1;
import java.util.Arrays;

public class selectionshort {

	public selectionshort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,7,1,5,2,4,9,6};
		System.out.println("Original Array:"+Arrays.toString(nums));
		selectionSort(nums);
		System.out.println("Sorted Array:"+Arrays.toString(nums));
		

	}
	public static void selectionSort(int[]nums) {
		int n=nums.length;
		for (int i=0;i<n-1;i++) {
			int minlndex =i;for (int j=i+1;j<n;j++)
				if (nums[j]<nums[minlndex])
					minlndex =j;
			int temp = nums[minlndex];
			nums[minlndex]=nums[i];
			nums[i]=temp;
		}
	}

}
