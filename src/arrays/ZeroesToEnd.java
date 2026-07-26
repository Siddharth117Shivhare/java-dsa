package arrays;

import java.util.Arrays;

public class ZeroesToEnd {

    public static void main(String[] args){

        int[] nums = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};

        int l = 0, r = 1;

        while(r < nums.length){

            System.out.println(
                    Arrays.toString(nums) +
                            "  l=" + l +
                            "  r=" + r
            );

            while(r < nums.length && nums[r] == 0){
                r++;
                if(r ==nums.length){
                    System.out.println("Reached end");
                    break;
                }
            }

            if(nums[l] != 0){
                l++;
                r++;
            }else{
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r++;
            }



        }

        System.out.println(Arrays.toString(nums));

        /*
        Attempt 2 on revision

        int[] nums = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};

        int l = 0, r = 1;

        while(r < nums.length){

            System.out.println(
                    Arrays.toString(nums) +
                            "  l=" + l +
                            "  r=" + r
            );

            while(r < nums.length && nums[r] == 0){
                r++;
                if(r ==nums.length){
                    System.out.println("Reached end");
                    break;
                }
            }

            if(nums[l] != 0){
                l++;
                r++;
            }else{
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r++;
            }



        }

        System.out.println(Arrays.toString(nums));
         */

        /*
        Standard solution:

        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
         */
    }
}
