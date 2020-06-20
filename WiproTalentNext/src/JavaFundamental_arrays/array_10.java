package JavaFundamental_arrays;

public class array_10 {

	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 0, 0, 1, 1};
		evenOdd(arr);
	}
	public static void evenOdd(int[] nums) {
		
		  int countE = 0;
		
		  int countO = nums.length-1;
		
		  int[] array = new int[nums.length];
		
		   
		
		  for (int i = 0; i < nums.length; i++) {
		
		    if (nums[i] % 2 == 0) {
		
		      array[countE] = nums[i];
		
		      countE++;
		
		    }
		
		    else {
		
		      array[countO] = nums[i];
		
		      countO--;
		
		    }
		
		  }
		
		  for(int k=0;k<nums.length;k++) {
			  System.out.print(array[k]+" ");
		  }
		
		}


}
