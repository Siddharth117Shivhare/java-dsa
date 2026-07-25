package arrays;

public class NumberThatAppearsOnce {

    public static void main(String[] args){

        int[] nums = {4,1,2,1,2};

        int result = 0;

        for( int num : nums ){
            result ^= num;
        }

        System.out.println(result);
    }
}

/*
Time: O(n)
Space: O(1)
 */