package arrays;

public class SortedArray {

    public static void main(String[] args){

        int[] nums = {1,2,3,6,4};

        for(int i = 0; i < nums.length - 1; i++){

            if(nums[i] > nums[i+1]){
                System.out.println("Not sorted");
                return;
            }
        }

        System.out.println("sorted");
    }
}

/*
* Time = O(n)
* Space = O(1)*/