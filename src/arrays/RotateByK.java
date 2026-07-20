package arrays;

import java.util.Arrays;

public class RotateByK {

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,6,7};
        int k = 2;
        boolean right = false;

        if(right){
            reverse(nums,0,nums.length - 1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length - 1);
        }else{
            reverse(nums,0, nums.length-1);
            reverse(nums,0,nums.length-k-1);
            reverse(nums, nums.length-k, nums.length-1);
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int a, int b){

        while(a<b){

            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;

            a++;
            b--;
        }
    }
}
