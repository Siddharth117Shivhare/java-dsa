package arrays;
import java.util.Arrays;

public class RemoveDuplicatesSortedArrays {

    public static void main(String[] args){

        int[] nums = {1,1,2,2,2,3,3};

        int left = 0, right = 1;

        while(right < nums.length){

            if(nums[left] != nums[right]){
                left++;
                nums[left] = nums[right];
                right++;
            }else{
                right++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

/*
 * Time = O(n)
 * Space = O(1)*/