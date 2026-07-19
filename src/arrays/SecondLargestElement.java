package arrays;

public class SecondLargestElement {

    public static void main(String[] args){

        int[] nums = {5,5};

        if( nums == null || nums.length == 0){
            throw new IllegalArgumentException("array cannot be null or empty");
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] > max){
                secMax = max;
                max = nums[i];
            }else if(nums[i] > secMax && nums[i] != max){
                secMax = nums[i];
            }

            if(nums[i] < min){
                secMin = min;
                min = nums[i];
            }else if(nums[i] < secMin && nums[i] != min){
                secMin = nums[i];
            }
        }

        System.out.println(max + "" + secMax);
    }
}

/*
* Time complexity is O(n) and Space is O(1)
* */