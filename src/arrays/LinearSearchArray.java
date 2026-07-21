package arrays;

public class LinearSearchArray {

    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}

/*
* time = O(m)
* space = O(1)*/
