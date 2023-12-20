import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    /**
     * Given an integer, check to see if it's a palindrome (reads the same forward and backward)
     *
     * @param x integer to check if it's a palindrome
     * @return true if it is, false if not
     */
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;

        int forward = x;
        int backward = 0;
        while(forward > 0){
            backward = (forward % 10) + (backward * 10);
            forward/= 10;
        }
        return backward == x;
    }

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers
    such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
     */

    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        //put the array and indices into a map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            //take the target, subtract the number at the index
            int complement = target - nums[i];
            //check to see if it's anywhere else in the map
            if(map.containsKey(complement) && map.get(complement) != i){
                solution[0] = map.get(complement);
                solution[1] = i;
            }
        }
        //if there is no solution, it will return [0, 0]
        return solution;
    }
}
