package arrays;

public class LargestElement {

    public static void main(String[] args) {

        int[] nums = {3,4,6,7,4,2,45,6};

        if(nums == null || nums.length == 0){
            throw new IllegalArgumentException("Array cannot be empty or null");
        }

        int max = nums[0];

        for(int i = 1; i < nums.length; i++){

            if(nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println(max);
    }
}

/*
 * Time complexity is basic O(n), we only traverse the array once
 * space complexity only O(1), because We only use a constant amount of extra memory,
 * regardless of the input size.
 */
