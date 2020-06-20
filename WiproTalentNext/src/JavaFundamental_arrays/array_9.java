package JavaFundamental_arrays;

public class array_9 {

	public static void main(String[] args) {
		int[] arr = {10,2,10,4,5};
		withoutTen(arr);
		

	}
	public static void withoutTen(int[] nums) {

		int[] result = new int[nums.length];

		int j = 0;

		for(int i = 0; i < nums.length; i++) {

			if(nums[i] == 10) {

			} else {

				result[j] = nums[i];

				j++;

			}

		}

		for(int i = j; i < nums.length; i++) {

			result[i] = 0;

  }
		for(int k=0;k<nums.length;k++) {
			System.out.print(result[k]+" ");
		}

  

}

	

}
