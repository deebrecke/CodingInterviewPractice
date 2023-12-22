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
    }//end of isPalendrome method

    /*
        Given an array of integers nums and an integer target, return indices of the two numbers
        such that they add up to target. You may assume that each input would have exactly one solution,
        and you may not use the same element twice. You can return the answer in any order.
     */

    /*
       This was my first attempt using a map. I didn't like that the time complexity was O(n^2)
     */
//
//    public static int[] twoSum(int[] nums, int target) {
//        int[] solution = new int[2];
//        Map<Integer, Integer> map = new HashMap<>();
//        //put the array and indices into a map
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            //take the target, subtract the number at the index
//            int complement = target - nums[i];
//            //check to see if it's anywhere else in the map
//            if(map.containsKey(complement) && map.get(complement) != i){
//                solution[0] = map.get(complement);
//                solution[1] = i;
//            }
//        }
//        //if there is no solution, it will return [0, 0]
//        return solution;
//    }

    /*
        So I refactored it to make it a linear time complexity
     */

    /**
     * This method takes in an array of integers and a target number (integer) and returns the indices
     * of the two numbers that add up to the target, assuming that there is no more than one solution
     * and that one element cannot be used twice.
     *
     * @param nums integer array to check for two numbers adding up to target
     * @param target int number that two numbers in  array should add up to
     * @return int[] the two indices of the two numbers that add up to the target
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            //take the target, subtract the number at the index
            int complement = target - nums[i];
            //check to see if it's anywhere else in the map
            //and check that it's not just double one number like if target = 8 and the complement is 4
            if(map.containsKey(complement) && map.get(complement) != i){
                solution[0] = map.get(complement);
                solution[1] = i;
            }else{
                //if it's not in the map, put it there
                map.put(nums[i], i);
            }
        }
        //if there is no solution, it will return [0, 0]
        //(I added this caveat even though the problem specified "Exactly One Solution")
            return solution;
    }

    /**
     * This function finds the longest common prefix string amongst an array of strings.
     *
     * @param strs String array to check
     * @return String of the longest prefix or empty String ("") if no common prefix exists
     */

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String longestPrefix = "";
        String firstWord = strs[0];
        int index = 0;
        for (int i = 1; i < strs.length; i++) {
            String word = strs[i];
            if(firstWord.charAt(index) == word.charAt(index)){
                longestPrefix += word.charAt(index);
                index ++;
            }
        }
        return longestPrefix;
    }
}//end of Practice1 class

