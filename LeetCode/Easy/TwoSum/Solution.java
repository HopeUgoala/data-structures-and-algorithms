package LeetCode.Easy.TwoSum;

import java.util.HashMap;
import java.util.Map;

/*
 1. Two Sum

 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 You can return the answer in any order.


 Example 1:
 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Output: Because nums[0] + nums[1] == 9, we return [0, 1].

 Example 2:
 Input: nums = [3,2,4], target = 6
 Output: [1,2]

 Example 3:
 Input: nums = [3,3], target = 6
 Output: [0,1]


 Constraints:
 2 <= nums.length <= 103
 -109 <= nums[i] <= 109
 -109 <= target <= 109
 Only one valid answer exists.
*/

public class Solution {

public int[] twoSum(int[] nums, int target) {
    // Create a HashMap to store the elements of the array and their indices
    Map<Integer, Integer> map = new HashMap<>();

    // Iterate through the array
    for (int i = 0; i < nums.length; i++) {
        // Calculate the complement (the value needed to reach the target)
        int complement = target - nums[i];

        // Check if the complement is already in the map and its index is not the same as the current index
        if (map.containsKey(complement) && i != map.get(complement)) {
            // Return the indices of the two numbers that add up to the target
            return new int[] {map.get(complement), i};
        } else {
            // If the complement is not found, put the current element and its index in the map
            map.put(nums[i], i);
        }
    }

    // If no such pair is found, return null
    return null;
}


 
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] complement = new int[2];

    // should be [0, 1]
    complement = solution.twoSum(new int[] {2, 7, 11, 15}, 9);
    System.out.println(complement[0] + " " + complement[1]);

    // should be [0, 1]
    complement = solution.twoSum(new int[] {3, 3}, 6);
    System.out.println(complement[0] + " " + complement[1]);

    // should be [1, 2]
    complement = solution.twoSum(new int[] {3, 2, 4}, 6);
    System.out.println(complement[0] + " " + complement[1]);
  }
}
