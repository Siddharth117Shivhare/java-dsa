package arrays;

import java.util.ArrayList;

public class UnionofSortedArrays {

    public static void main(String[] args){

        int[] arr1 = {1,1,2};
        int[] arr2 = {1,2,2};
        int m = arr1.length;
        int n = arr2.length;

        int l = 0, r = 0;

        ArrayList<Integer> result = new ArrayList<>();

        while(l<m && r<n) {

            if (arr1[l] < arr2[r]) {
                if(result.isEmpty() || arr1[l] != result.get(result.size() - 1)) {
                    result.add(arr1[l]);
                }
                l++;
            } else if (arr1[l] > arr2[r]) {
                if(result.isEmpty() || arr2[r] != result.get(result.size() - 1)){
                    result.add(arr2[r]);
                }
                r++;
            } else {
                if (result.isEmpty() || arr1[l] != result.get(result.size() - 1)) {
                    result.add(arr1[l]);
                }
                l++;
                r++;
            }
        }

        while (l < m) {
            if(result.isEmpty() || arr1[l] != result.get(result.size() - 1)) {
                result.add(arr1[l]);
            }
            l++;
        }

        while (r < n) {
            if(result.isEmpty() || arr2[r] != result.get(result.size() - 1)){
                result.add(arr2[r]);
            }
            r++;
        }

        System.out.println(result);
    }
}


/*
 * Time Complexity: O(m + n)
 * Space Complexity: O(m + n)
 */