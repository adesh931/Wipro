package JavaFundamental_arrays;

public class array_11 {

	public static void main(String[] args) {
		int[] arr = {1, 4, 1, 4};
		boolean s = on_14(arr);
		System.out.println(s);

	}
	public static boolean on_14(int[] nums) {
		
		  boolean isTrue = true;
		
		   
		
		  for (int i = 0; i < nums.length; i++) {
		
		    if (nums[i] != 1 && nums[i] != 4)
		
		      isTrue = false;
		
		  }
		
		  return isTrue;
		
		   
		
		}


}
