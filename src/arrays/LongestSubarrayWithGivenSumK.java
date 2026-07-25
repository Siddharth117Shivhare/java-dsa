package arrays;

public class LongestSubarrayWithGivenSumK {
    public static void main(String[] args){

        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int left = 0;
        int sum = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                max = Math.max(max, right - left + 1);
            }
        }

        System.out.println(max);
    }
}

/*
Time = O(n), actually 2n since both l and r cover the array once only
space = O(1)
 */