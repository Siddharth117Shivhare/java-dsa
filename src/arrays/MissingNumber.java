package arrays;

import java.util.ArrayList;

public class MissingNumber {

    // Brute Force
    public static int bruteForce(int[] nums) {

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 1; i <= nums.length + 1; i++) {
            a.add(i);
        }

        for (int num : nums) {
            a.remove(Integer.valueOf(num));
        }

        return a.get(0);
    }

    /*
     * Time: O(n²)
     * Space: O(n)
     */


    // Sum Formula
    public static int sumApproach(int[] nums) {

        int n = nums.length + 1;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    /*
     * Time: O(n)
     * Space: O(1)
     */


    // XOR Approach
    public static int xorApproach(int[] nums) {

        int xor = 0;
        int n = nums.length + 1;

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        // XOR all elements in the array
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }

    /*
     * Time: O(n)
     * Space: O(1)
     */


    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 5, 6, 7, 8};

        System.out.println("Brute Force : " + bruteForce(nums));
        System.out.println("Sum Approach: " + sumApproach(nums));
        System.out.println("XOR Approach: " + xorApproach(nums));
    }
}